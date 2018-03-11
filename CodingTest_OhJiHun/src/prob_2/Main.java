package prob_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// ��ĳ�� ����
		Scanner in = new Scanner(System.in);
		
		try
		{
			// ��ü ����
			Prob_2 prob_2 = new Prob_2();
			Calc   calc   = new Calc()  ;
			
			// ��ǥ �Է�
			System.out.print("��ǥ �Է� : ");
			prob_2.setCoordinates(in.nextLine());
			
			// �Է¹��� ��ǥ �������(" ") split
			String arrayCoordinates[] = prob_2.getCoordinates().split(" ");
			
			while (true)
			{
				if (6 == arrayCoordinates.length)
				{
					break;
				}
				else
				{
					System.out.println("\n5���� ��ǥ�� ������ǥ�� ������ �Է� �ϼ���.(��ǥ ���� ����, ��ǥ�� ()�� ǥ���ϰ� ���ڿ��� ����)\n");
					System.out.print("��ǥ �Է� : ");
					
					prob_2.setCoordinates(in.nextLine());
					arrayCoordinates = prob_2.getCoordinates().split(" ");
				}
			}
			
			// ����� ���Ŀ� ��ǥ�迭 ����
			String sortCoordinates [] = new String[arrayCoordinates.length];
			System.arraycopy(arrayCoordinates, 0, sortCoordinates, 0, arrayCoordinates.length);
			
			// ���� ��ǥ ����
			prob_2.setIndex(Integer.parseInt(arrayCoordinates[arrayCoordinates.length - 1]) - 1);
			
			// ��ǥ�� �Ÿ� ������ �迵
			double[] distance = new double[arrayCoordinates.length];
			
			for (int i = 0; i < arrayCoordinates.length - 1; i++) 
			{
				// ��ǥ�� �Ÿ� ���
				distance[i] = calc.getDistance(arrayCoordinates[prob_2.getIndex()], arrayCoordinates[i]);
				
				for (int j = 0; j < i; j++) 
				{
					if (0 > distance[i] - distance[j])
					{
						// ��ǥ ����
						prob_2.setStringSort( sortCoordinates[i])   ;
						sortCoordinates[i]  = sortCoordinates[j]    ;
						sortCoordinates[j]  = prob_2.getStringSort();
						
						// �Ÿ� ����
						prob_2.setDoubleSort( distance[i])          ;
						distance[i]         = distance[j]           ;
						distance[j]         = prob_2.getDoubleSort();
						
					} // end of if
					
				} // end of for
				
			} // end of for
			
			// ����� ���
			System.out.print("���       : ");
			for (int i = 0; i < sortCoordinates.length - 1; i++) 
			{
				System.out.print(sortCoordinates[i]);
				
				// ������ ��ǥ ��� �� ���� ����
				if (i != sortCoordinates.length - 2)
				{
					System.out.print(" ");
					
				} // end of if
				
			} // end of for
			
			// ��ĳ�� ����
			in.close();
		} // end of try
		
		catch (Exception e) 
		{
			e.printStackTrace();
			// ��ĳ�� ����
			in.close();
		} // end of catch
	}

}
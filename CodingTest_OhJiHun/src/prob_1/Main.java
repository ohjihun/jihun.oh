package prob_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ��ĳ�� ����
		Scanner in = new Scanner(System.in);
		
		try
		{
			// ��ü ����
			Prob_1 prob_1 = new Prob_1();
			
			// ���� �Է�
			while (true)
			{
				System.out.print("���� �Է� : ");
				prob_1.setInputNum(in.nextInt());
				
				if (   1      <= prob_1.getInputNum() 
				    && 999999 >= prob_1.getInputNum())
				{
					break;
				}
				else
				{
					System.out.println("\n�Է��� ���� n�� 1 �� n �� 999,999 �Դϴ�.\n�ٽ� �Է��ϼ���.\n");
				}
			}
			
			while (true) 
			{
				prob_1.setInputNum(prob_1.getInputNum() + 1 );
				prob_1.setZeroChk (prob_1.getInputNum() + "");
				
				// �Է¹��� ���ڿ� 0�� �ִ��� üũ
				for (int i = 0; i < prob_1.getZeroChk().length(); i++) 
				{
					if ('0' == prob_1.getZeroChk().charAt(i)) 
					{
						prob_1.setZeroFlag(true);
						break;
					} // end of if
					else
					{
						prob_1.setZeroFlag(false);
					} // end of else
					
				} // end of for
				
				// �Է¹��� ���ڿ� 0�� ������ Ż��
				if (false == prob_1.isZeroFlag()) 
				{
					break;
				} // end of if
				
			} // end of while
			
			System.out.println("���� ��    : " + prob_1.getInputNum());                                           
			
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
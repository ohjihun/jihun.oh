package prob_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner in = new Scanner(System.in);
		
		try
		{
			// 객체 생성
			Prob_2          prob_2 = new Prob_2()         ;
			Calc            calc   = new Calc()           ;
			ValidationCheck valChk = new ValidationCheck();
			
			// 좌표 입력
			System.out.print("좌표 입력 : ");
			prob_2.setCoordinates(in.nextLine());
			
			// 입력받은 좌표 공백기준(" ") split
			String arrayCoordinates[] = prob_2.getCoordinates().split(" ");
			
			// validation check
			while (true)
			{
				// validation check method 호출
				prob_2.setValChk(valChk.getValidationCheck(arrayCoordinates));

				// validation error
				if (false == prob_2.isValChk())
				{
					System.out.println("\n5개의 좌표와 기준좌표의 순번을 입력 하세요.(좌표 값은 정수, 좌표는 ()로 표현하고 빈문자열로 구분)\n");
					System.out.print("좌표 입력 : ");
					
					// 재입력을 위한 초기화
					prob_2.setCoordinates("");
					prob_2.setValChk(true)   ;
					valChk.setValchk(true)   ;
					
					// 재입력
					prob_2.setCoordinates(in.nextLine());
					arrayCoordinates = prob_2.getCoordinates().split(" ");
				} // end of if
				else
				{
					break;
				} // end of else
				
			} // end of while
			
			// 결과값 정렬용 좌표배열 복사
			String sortCoordinates [] = new String[arrayCoordinates.length];
			System.arraycopy(arrayCoordinates, 0, sortCoordinates, 0, arrayCoordinates.length);
			
			// 기준 좌표 설정
			prob_2.setIndex(Integer.parseInt(arrayCoordinates[arrayCoordinates.length - 1]) - 1);
			
			// 좌표간 거리 저장할 배영
			double[] distance = new double[arrayCoordinates.length];
			
			for (int i = 0; i < arrayCoordinates.length - 1; i++) 
			{
				// 좌표간 거리 계산
				distance[i] = calc.getDistance(arrayCoordinates[prob_2.getIndex()], arrayCoordinates[i]);
				
				for (int j = 0; j < i; j++) 
				{
					if (0 > distance[i] - distance[j])
					{
						// 좌표 정렬
						prob_2.setStringSort( sortCoordinates[i])   ;
						sortCoordinates[i]  = sortCoordinates[j]    ;
						sortCoordinates[j]  = prob_2.getStringSort();
						
						// 거리 정렬
						prob_2.setDoubleSort( distance[i])          ;
						distance[i]         = distance[j]           ;
						distance[j]         = prob_2.getDoubleSort();
						
					} // end of if
					
				} // end of for
				
			} // end of for
			
			// 결과값 출력
			System.out.print("결과 : ");
			for (int i = 0; i < sortCoordinates.length - 1; i++) 
			{
				System.out.print(sortCoordinates[i]);
				
				// 마지막 좌표 출력 후 공백 제외
				if (i != sortCoordinates.length - 2)
				{
					System.out.print(" ");
				} // end of if
				
			} // end of for
			
			// 스캐너 종료
			in.close();
		} // end of try
		
		catch (Exception e) 
		{
			e.printStackTrace();
			// 스캐너 종료
			in.close();
		} // end of catch
	}

}

package prob_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner in = new Scanner(System.in);
		
		try
		{
			// 객체 생성
			Prob_1 prob_1 = new Prob_1();
			
			// validation check
			while (true)
			{
				try 
				{
					System.out.print("숫자 입력 : ");
					prob_1.setInputNum(Integer.parseInt(in.nextLine()));
					
					if (   1      <= prob_1.getInputNum() 
					    && 999999 >= prob_1.getInputNum())
					{
						break;
					}
					else
					{
						System.out.println("\n입력할 숫자 n은 1 ≤ n ≤ 999,999 입니다.\n다시 입력하세요.\n");
					}
				} 
				catch (NumberFormatException e) 
				{
					System.out.println("\n입력할 숫자 n은 1 ≤ n ≤ 999,999 입니다.\n다시 입력하세요.\n");
				}
			}
			
			while (true) 
			{
				prob_1.setInputNum(prob_1.getInputNum() + 1 );
				prob_1.setZeroChk (prob_1.getInputNum() + "");
				
				// 입력받은 숫자에 0이 있는지 체크
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
				
				// 입력받은 숫자에 0이 없으면 탈출
				if (false == prob_1.isZeroFlag()) 
				{
					break;
				} // end of if
				
			} // end of while
			
			System.out.println("다음 수    : " + prob_1.getInputNum());                                           
			
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

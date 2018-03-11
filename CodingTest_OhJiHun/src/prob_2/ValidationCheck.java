package prob_2;

public class ValidationCheck {

	private boolean valchk ;

	public ValidationCheck() {
		this.valchk = true ;
	}
	
	public void setValchk(boolean valchk) {
		this.valchk = valchk;
	}

	public boolean getValidationCheck(String[] arrayCoordinates)
	{
		if (6 == arrayCoordinates.length)
		{
			for (int i = 0; i < arrayCoordinates.length; i++) 
			{
				// 마지막번째(기준좌표순번)이 아니고 좌표의 길이가 (n,n)과 같은지 체크
				if (   i != arrayCoordinates.length - 1
					&& 5 != arrayCoordinates[i].length())
				{
					this.valchk = false;
					break;
				} // end of if
				// 마지막번쨰(기준좌표순번) 일 때
				else if (i == arrayCoordinates.length - 1)
				{
					// 기준좌표순번이 숫자인지 체크
					if (!Character.isDigit(arrayCoordinates[i].charAt(0)))
					{
						this.valchk = false;
						break;
					}
				} // end of if
				// 좌표의 형태가 (n,n) 인지 체크
				else
				{
					for (int j = 0; j < arrayCoordinates[i].length(); j++) 
					{
						if (   0 == j 
							&& arrayCoordinates[i].charAt(j) != '(')
						{
							this.valchk = false;
							break;
						} // end of if
						else if (   1 == j 
								 && !Character.isDigit(arrayCoordinates[i].charAt(j)))
						{
							this.valchk = false;
							break;
						} // end of if
						else if (   2 == j 
								 && arrayCoordinates[i].charAt(j) != ',')
						{
							this.valchk = false;
							break;
						} // end of if
						else if (   3 == j 
								 && !Character.isDigit(arrayCoordinates[i].charAt(j)))
						{
							this.valchk = false;
							break;
						} // end of if
						else if (   4 == j 
								 && arrayCoordinates[i].charAt(j) != ')')
						{
							this.valchk = false;
							break;
						} // end of if
						
					} // end of for
					
					// 하나라도 만족하지 않으면 error
					if (false == this.valchk)
					{
						break;
					} // end of if
					
				} // end of else
				
			} // end of for
			
		} // end of if
		else
		{
			this.valchk = false;
		} // end of else
		
		return this.valchk;
	}
	
}

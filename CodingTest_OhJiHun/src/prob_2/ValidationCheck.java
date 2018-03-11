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
				// ��������°(������ǥ����)�� �ƴϰ� ��ǥ�� ���̰� (n,n)�� ������ üũ
				if (   i != arrayCoordinates.length - 1
					&& 5 != arrayCoordinates[i].length())
				{
					this.valchk = false;
					break;
				} // end of if
				// ����������(������ǥ����) �� ��
				else if (i == arrayCoordinates.length - 1)
				{
					// ������ǥ������ �������� üũ
					if (!Character.isDigit(arrayCoordinates[i].charAt(0)))
					{
						this.valchk = false;
						break;
					}
				} // end of if
				// ��ǥ�� ���°� (n,n) ���� üũ
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
					
					// �ϳ��� �������� ������ error
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
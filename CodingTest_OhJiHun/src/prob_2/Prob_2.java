package prob_2;

public class Prob_2 {
	
	private String  coordinates ;
	private int     index       ;  
	private String  stringSort  ;
	private double  doubleSort  ;
	private boolean valChk      ;
	
	public Prob_2() {
		this.coordinates  = ""  ;
		this.index        = 0   ;
		this.stringSort   = ""  ;
		this.doubleSort   = 0.0 ;
		this.valChk       = true;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getStringSort() {
		return stringSort;
	}

	public void setStringSort(String stringSort) {
		this.stringSort = stringSort;
	}

	public double getDoubleSort() {
		return doubleSort;
	}

	public void setDoubleSort(double doubleSort) {
		this.doubleSort = doubleSort;
	}

	public boolean isValChk() {
		return valChk;
	}

	public void setValChk(boolean valChk) {
		this.valChk = valChk;
	}
	
}

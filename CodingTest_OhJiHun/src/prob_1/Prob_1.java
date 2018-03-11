package prob_1;

public class Prob_1 {

	private String  zeroChk  ;
	private int     inputNum ;
	private boolean zeroFlag ;

	public Prob_1() {
		this.zeroChk  = ""   ;
		this.inputNum = 1    ;
		this.zeroFlag = false;
	}

	public String getZeroChk() {
		return zeroChk;
	}

	public void setZeroChk(String zeroChk) {
		this.zeroChk = zeroChk;
	}

	public int getInputNum() {
		return inputNum;
	}

	public void setInputNum(int inputNum) {
		this.inputNum = inputNum;
	}

	public boolean isZeroFlag() {
		return zeroFlag;
	}

	public void setZeroFlag(boolean zeroFlag) {
		this.zeroFlag = zeroFlag;
	}
	
}

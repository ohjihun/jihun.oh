package prob_2;

public class Calc {

	private double distance = 0.0;
	private int    x1       = 0  ;
	private int    y1       = 0  ;
	private int    x2       = 0  ;
	private int    y2       = 0  ;
	
	public Calc() {
		
	}

	public double getDistance(String coordinates1, String coordinates2) {
		
		this.x1 = Integer.parseInt( coordinates1.charAt(1) + "" );
		this.y1 = Integer.parseInt( coordinates1.charAt(3) + "" );
		this.x2 = Integer.parseInt( coordinates2.charAt(1) + "" );
		this.y2 = Integer.parseInt( coordinates2.charAt(3) + "" );
		
		// 좌표간 거리계산
		this.distance = Math.sqrt( Math.pow((double)(this.x2-this.x1), 2) + Math.pow((double)(this.y2-this.y1), 2) );
		
		return this.distance;
		
	}
}

package guitarThing;

public enum OpenStrings {
	E(82.41),
	A(110.00),
	D(146.83),
	G(196.00),
	B(246.94),
	e(329.63);
	
	private double hz;
	
	private OpenStrings(double hz) {
		this.hz = hz;
	}
	
	public double getHz() {
		return hz;
	}
}

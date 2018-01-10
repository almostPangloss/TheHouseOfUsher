package guitarThing;


public class Wire {
	private final int lengthMM = 624;
	private double hz;
	private OpenStrings stringName;
	
	public Wire(OpenStrings stringName) {
		this.stringName = stringName;
		this.hz = stringName.getHz();
	}
	
	public String getName() {
		return stringName.name();
	}
	public int getLength() {
		return lengthMM;
	}
	public double getHz() {
		return hz;
	}
}

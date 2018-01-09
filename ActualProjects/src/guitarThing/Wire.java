package guitarThing;

/*
 * https://theengineerspulse.blogspot.com/2011/05/guitar-string-theory.html
 */

public class Wire {
	private final int lengthMM = 624;
	private double hz;
	private GuitarStringNames stringName;
	
	public Wire(GuitarStringNames stringName) {
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

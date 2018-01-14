package guitarThing;

public class GuitarNote {
	
	String stringName;
	int fret;
	String noteName;
	double freq;
	
	public GuitarNote( String stringName, int fret, String noteName, double freq ){
		this.stringName = stringName;
		this.fret = fret;
		this.noteName = noteName;
		this.freq = freq;
	}

}

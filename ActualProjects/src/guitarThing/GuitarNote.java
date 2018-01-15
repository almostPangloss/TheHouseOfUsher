package guitarThing;

public class GuitarNote {
	
	OpenStrings stringName;
	int fret;
	String noteName;
	double freq;
	
	public GuitarNote( OpenStrings stringName, int fret, String noteName, double freq ){
		this.stringName = stringName;
		this.fret = fret;
		this.noteName = noteName;
		this.freq = freq;
	}
	
	public GuitarNote( String noteName ){
		this.stringName = null;
		this.fret = -1;
		this.noteName = noteName;
		this.freq = -1;
	}
}

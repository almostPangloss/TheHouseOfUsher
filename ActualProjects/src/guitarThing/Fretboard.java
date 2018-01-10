package guitarThing;

public class Fretboard{
	
	 public Fretboard() {
	 }
	 
	 public double fretedHz(int fret, OpenStrings wire) {
		 double fretedHz = 0.0;
		 
		 fretedHz = wire.getHz();
		 
		 for ( int i = 1; i <= fret; i++) {
			 fretedHz *= 1.0595;
		 }		 
		 
		 return fretedHz;
	 }
}

package guitarThing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fretboard{
	
	public List<String> MusicalNotes = new ArrayList<String>();
	
	public Fretboard() {
	}
	 
	 // This takes in the fret and the string being held at 
	 // that fret and returns the Hz of the resulting note
	 public double fretedHz(int fret, OpenStrings wire) {
		 double fretedHz = 0.0;
		 
		 fretedHz = wire.getHz();
		 
		 for ( int i = 1; i <= fret; i++) {
			 fretedHz *= 1.0595;
		 }		 
		 
		 return fretedHz;
	}
	
	public List<String> createFullFretboard(){
		List<String> fullFretboard;
		
		MusicalNotes.addAll(Arrays.asList("E", "F", "Gb", "G", "Ab", 
				"A", "Bb", "B", "C", "Db", "D", "Eb"));
		
		for (OpenStrings wire : OpenStrings.values()) {
			for (int fret = 0; fret <= 12; fret++) {
				String noteName = "";
				noteName = MusicalNotes.get((MusicalNotes.indexOf(wire.name().toUpperCase()) + fret) % 12);				
				double freq = this.fretedHz(fret, wire);
				
				// Trying to create an object in a loop
				// Looks like I can create a list of unnamed object entries, but not a new object
				// so, do that
				GuitarNote noteName1 = new GuitarNote(wire, fret, noteName1, freq );
			}
		}
		return fullFretboard;		
	}
}
package guitarThing;

import java.util.ArrayList;
import java.util.List;

public class Fretboard{
	
	List<String> MusicalNotes = new ArrayList<>();
	
	public Fretboard(List<String> MusicalNotes) {
		this.MusicalNotes = MusicalNotes;
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
	
	public List<GuitarNote> createFullFretboard(){
		List<GuitarNote> fullFretboard = new ArrayList<GuitarNote>();
		
		for (OpenStrings wire : OpenStrings.values()) {
			for (int fret = 0; fret <= 12; fret++) {
				String noteName = "";
				noteName = MusicalNotes.get((MusicalNotes.indexOf(wire.name().toUpperCase()) + fret) % 12);				
				double freq = this.fretedHz(fret, wire);
				
				// Trying to create an object in a loop
				// Looks like I can create a list of unnamed object entries, but not a new object
				// so, do that
				fullFretboard.add(new GuitarNote(wire, fret, noteName, freq ));
			}
		}
		return fullFretboard;
	}

	public List<GuitarNote> createMajorScale(GuitarNote note){
		List<GuitarNote> scale = new ArrayList<>();
		
		int tone = 0;
		for (int i = 0; i < 8; i++) {
			scale.add( new GuitarNote(MusicalNotes.get((MusicalNotes.indexOf(note.noteName) + tone) % 12)));
			
			if ( i == 2 || i == 6) {
				tone += 1;
			} else {
				tone += 2;
			}
		}
		
		return scale;
	}
	
	public List<GuitarNote> createMinorScale(GuitarNote note){
		List<GuitarNote> scale = new ArrayList<>();
		
		int tone = 0;
		for (int i = 0; i < 8; i++) {
			scale.add( new GuitarNote(MusicalNotes.get((MusicalNotes.indexOf(note.noteName) + tone) % 12)));
			
			if ( i == 1 || i == 4) {
				tone += 1;
			} else {
				tone += 2;
			}
		}
		
		return scale;
	}
	
	public List<GuitarNote> createMajorChord(GuitarNote note){
		List<GuitarNote> chord = new ArrayList<>();
		List<GuitarNote> scale = new ArrayList<>();
		
		scale = this.createMajorScale(note);
		chord.add(scale.get(0));
		chord.add(scale.get(2));
		chord.add(scale.get(4));
		
		return chord;
	}
}
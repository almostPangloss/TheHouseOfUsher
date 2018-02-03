package guitarThing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fretboard{
	
	List<String> MusicalNotes = new ArrayList<>(Arrays.asList("E", "F", "F#", "G", "G#", 
			"A", "A#", "B", "C", "C#", "D", "D#"));
	List<List<GuitarNote>> fullFretboard = this.createFullFretboard();
	
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
	
	public List<List<GuitarNote>> createFullFretboard(){
		
		List<GuitarNote> EString = new ArrayList<GuitarNote>();
		List<GuitarNote> AString = new ArrayList<GuitarNote>();
		List<GuitarNote> DString = new ArrayList<GuitarNote>();
		List<GuitarNote> GString = new ArrayList<GuitarNote>();
		List<GuitarNote> BString = new ArrayList<GuitarNote>();
		List<GuitarNote> eString = new ArrayList<GuitarNote>();
		
		List<List<GuitarNote>> fullFretboard = new ArrayList<List<GuitarNote>>();
		fullFretboard.add(EString);
		fullFretboard.add(AString);
		fullFretboard.add(DString);
		fullFretboard.add(GString);
		fullFretboard.add(BString);
		fullFretboard.add(eString);
		
		int count = 0;
		for (OpenStrings wire : OpenStrings.values()) {			
			for (int fret = 0; fret <= 15; fret++) {
				String noteName = "";
				noteName = MusicalNotes.get((MusicalNotes.indexOf(wire.name().toUpperCase()) + fret) % 12);				
				double freq = this.fretedHz(fret, wire);
				
				// Trying to create an object in a loop
				// Looks like I can create a list of unnamed object entries, but not a new object
				// so, do that
				fullFretboard.get(count).add(new GuitarNote(wire, fret, noteName, freq ));
			}
			count++;
		}
		return fullFretboard;
	}

	public List<GuitarNote> createMajorScale(GuitarNote note){
		List<GuitarNote> scale = new ArrayList<>();
		
		int tone = 0;
		for (int i = 0; i < 8; i++) {
			/*
			 * Get the name of the note that's been passed, find that note in the list of possible notes, 
			 * then add to it the tone, which keeps the notes returned within the scale,
			 * then add that new note into the Scale var as a GuitarNote object, so it has all the info tied to it
			 * 
			 * Hmm, this also needs to check to see if the full scale can be created
			 *  - that'll be easy enough: just find which scale ends with the high e string on the last(15th) fret,
			 *    and take the first note of that scale - 
			 *    any note after that can't have its full scale created on this guitar
			 *    
			 *    This will ne to surround the whole creation, thing, and, if it can't be done, it'll say so, and return 
			 *    an empty/null/unchanged List of List of GuitarNote
			 */
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
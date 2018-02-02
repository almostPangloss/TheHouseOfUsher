package guitarThing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 Guitar note finder:
 Show where else on the fretboard that note lives
 Show in a different color its compliments?
 Chords? 
 
***
Fretboard
 - frets, each one a half step apart
String
 - each with a base vibration rate which, with the fret considered, creates the note
 - each string's base vibration is the previous one at fret 5, other than B

When a note is indicated, show other places that note appears on the neck
Also indicate octaves of that note
***

 */

public class Main {
	
	public static List<String> MusicalNotes = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		MusicalNotes.addAll(Arrays.asList("E", "F", "F#", "G", "G#", 
				"A", "A#", "B", "C", "C#", "D", "D#"));
		
		Fretboard fretboard = new Fretboard(MusicalNotes);
		List<List<GuitarNote>> fullFretboard = fretboard.createFullFretboard();
		
		
		for (List<GuitarNote> wire : fullFretboard) {
			for (GuitarNote g : wire) {
				System.out.println("Playing the " + g.stringName + " string at fret " + g.fret + " gives you:");
				System.out.println(g.noteName + ": " + g.freq);
				List<GuitarNote> scale = fretboard.createMajorScale(g);
				System.out.println(scale);
				scale = fretboard.createMinorScale(g);
				System.out.println(scale);
			}
		}
//		
//		MusicalNotes.addAll(Arrays.asList("E", "F", "Gb", "G", "Ab", 
//				"A", "Bb", "B", "C", "Db", "D", "Eb"));		
//		
//		Fretboard fretboard = new Fretboard();
//		
//		for (OpenStrings wire : OpenStrings.values()) {
//			for (int i = 0; i <= 12; i++) {
//				String NoteName = "";
//				/* 
//				 * The meat of this program, so far: 
//				 * The current wire's name is grabbed and converted to uppercase - 
//				 * that's because the second E string is denoted with a lower case E, 
//				 * which isn't found in the list of notes, 
//				 * and is needed to set where to count from.
//				 * Then to that is added i, which is the fret we're on. 
//				 * To get the note name on that wire at that fret, the fret number
//				 * is added to the wire root note, then the index of that note 
//				 * is modded by 12, forcing a mapping to the 12 note scale.
//				 */
//				NoteName = MusicalNotes.get((MusicalNotes.indexOf(wire.name().toUpperCase()) + i) % 12);
//				System.out.println("Fretting the " + wire.name() + " string at " + i + " gives you\n"
//						+ "the note " + NoteName +" and a Hz of:");				
//				System.out.println(fretboard.fretedHz(i, wire));
//				System.out.println();
//			}
//		}
	}
}




















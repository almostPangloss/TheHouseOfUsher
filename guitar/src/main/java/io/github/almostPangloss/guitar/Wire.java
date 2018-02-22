package io.github.almostPangloss.guitar;

import java.util.List;

public class Wire {
    private static final int DEFAULT_FRETS = 15;
    private final int frets;
    private final Note base;

    public Wire(final Note base, int frets) {
        this.base = base;
        this.frets = frets;
    }
    
    public Wire(Note base) {
        this(base, DEFAULT_FRETS);
    }

    public Note getNote(final int fret) {
        if(fret < 0 || fret > frets) {
            throw new IllegalArgumentException("Can't use a negative fret or more than the number of frets on the string!");
            
        }
        if(fret == 0) {
            return base;
        }
        return base.higherSemitone(fret);
    }
    
    public List<Integer> getFrets(Note note) {
        
    }
}

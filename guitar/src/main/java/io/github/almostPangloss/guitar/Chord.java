package io.github.almostPangloss.guitar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class Chord implements Set<Note> {
    private final Set<Note> notes;
    private final String name;

    /**
     * @return the notes
     */
    public Set<Note> getNotes() {
        return notes;
    }

    public String getName() {
        return name;
    }
    
    public Chord(String name, Collection<Note> notes) {
        this.name = name;
        this.notes = ImmutableSet.copyOf(notes);
    }
    
    @Override
    public boolean add(Note note) {
        return notes.add(note);
    }

    @Override
    public boolean addAll(Collection<? extends Note> notes) {
        return this.notes.addAll(notes);
    }

    @Override
    public void clear() {
        notes.clear();
    }

    @Override
    public boolean contains(Object note) {
        return notes.contains(note);
    }

    @Override
    public boolean containsAll(Collection<?> notes) {
        return this.notes.containsAll(notes);
    }

    @Override
    public boolean isEmpty() {
        return notes.isEmpty();
    }

    @Override
    public Iterator<Note> iterator() {
        return notes.iterator();
    }

    @Override
    public boolean remove(Object note) {
        return notes.remove(note);
    }

    @Override
    public boolean removeAll(Collection<?> notes) {
        return this.notes.removeAll(notes);
    }

    @Override
    public boolean retainAll(Collection<?> notes) {
        return this.notes.retainAll(notes);
    }

    @Override
    public int size() {
        return notes.size();
    }

    @Override
    public Object[] toArray() {
        return notes.toArray();
    }

    @Override
    public <T> T[] toArray(T[] notes) {
        return this.notes.toArray(notes);
    }
}

package refactoring_guru.design_patterns.behavioral.iterator.example.iterators;

import refactoring_guru.design_patterns.behavioral.iterator.example.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
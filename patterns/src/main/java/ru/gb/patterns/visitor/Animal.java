package ru.gb.patterns.visitor;

public interface Animal {
    void accept(AnimalOperation $operation);
}

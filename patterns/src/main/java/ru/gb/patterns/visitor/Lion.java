package ru.gb.patterns.visitor;

public class Lion implements Animal {
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }

    public void roar() {
        System.out.println("Roaaar!");
    }
}

package ru.gb.patterns.visitor;

public interface AnimalOperation {
    void visitMonkey(Monkey monkey);
    void visitLion(Lion lion);
    void visitDolphin(Dolphin dolphin);
}

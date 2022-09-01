package ru.gb.patterns.visitor;

public class MainVisitor {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Dolphin dolphin = new Dolphin();
        Jump jump = new Jump();
        Speak speak = new Speak();

        monkey.accept(speak);
        monkey.accept(jump);
        lion.accept(speak);
        lion.accept(jump);
        dolphin.accept(speak);
        dolphin.accept(jump);
    }
}

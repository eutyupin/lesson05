package ru.gb.patterns.command;

public interface Command {
    void execute();
    void undo();
    void redo();
}

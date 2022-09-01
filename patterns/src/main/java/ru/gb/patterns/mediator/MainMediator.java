package ru.gb.patterns.mediator;

public class MainMediator {
    public static void main(String[] args) {
        ChatRoom mediator = new ChatRoom();

        User john = new User("John Doe", mediator);
        User jane = new User("Jane Doe", mediator);

        john.send("Hi there!");
        jane.send("Hey!");

    }
}

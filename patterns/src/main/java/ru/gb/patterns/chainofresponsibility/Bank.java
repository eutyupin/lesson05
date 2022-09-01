package ru.gb.patterns.chainofresponsibility;

public class Bank extends Account {
    private float balance;

    public Bank(float balance) {
        this.balance = balance;
    }
}

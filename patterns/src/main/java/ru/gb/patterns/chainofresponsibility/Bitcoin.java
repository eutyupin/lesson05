package ru.gb.patterns.chainofresponsibility;

public class Bitcoin extends Account {
    private float balance;

    public Bitcoin(float balance) {
        this.balance = balance;
    }
}

package ru.gb.patterns.chainofresponsibility;

public class Paypal extends Account {
    private float balance;

    public Paypal(float balance) {
        this.balance = balance;
    }
}

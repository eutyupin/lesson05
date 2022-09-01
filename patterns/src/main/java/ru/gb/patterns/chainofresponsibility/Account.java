package ru.gb.patterns.chainofresponsibility;

public class Account {
    private Account successor;
    private float balance;

    public void setNext(Account account) {
        successor = account;
    }

    public void pay(float amountToPay) throws Exception {
        if (canPay(amountToPay)) {
            System.out.printf("Paid %s using %s" + System.lineSeparator(), amountToPay, this.getClass().getName());
        } else if(successor != null) {
            System.out.printf("Cannot pay using %s. Proceeding .."  + System.lineSeparator(), this.getClass().getName());
        successor.pay(amountToPay);
    } else {
        throw new Exception("None of the accounts have enough balance");
    }
    }

    public boolean canPay(float amount) {
        return balance >= amount;
    }
}

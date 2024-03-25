package ru.podmarkov.abstracts;

import ru.podmarkov.interfaces.IDeposit;
import ru.podmarkov.interfaces.IWithdraw;

public abstract class Card extends BankProduct implements IDeposit, IWithdraw {

    public Card(String name, double balance, String currency) {
        super(name, balance, currency);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}

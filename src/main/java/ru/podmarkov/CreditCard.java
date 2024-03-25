package ru.podmarkov;

import ru.podmarkov.abstracts.Card;

public class CreditCard extends Card {
    private final double rate;

    public CreditCard(String name, String currency, double balance, double rate) {
        super(name, balance, currency);
        this.rate = rate;
    }

    public double getDebt() {
        return balance < 0 ? balance * (1 + rate) : 0;
    }
}

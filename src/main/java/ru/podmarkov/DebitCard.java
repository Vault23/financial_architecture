package ru.podmarkov;

import ru.podmarkov.abstracts.Card;

public class DebitCard extends Card {

    public DebitCard(String name, String currency, double balance) {
        super(name, balance, currency);
    }
}

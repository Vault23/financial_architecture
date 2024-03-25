package ru.podmarkov.abstracts;

import lombok.AllArgsConstructor;
import ru.podmarkov.interfaces.IFinancialProduct;

@AllArgsConstructor
public abstract class BankProduct implements IFinancialProduct {

    protected String currency;
    protected double balance;
    protected String name;

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getName() {
        return name;
    }
}

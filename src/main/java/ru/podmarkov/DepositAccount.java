package ru.podmarkov;

import ru.podmarkov.abstracts.BankProduct;
import ru.podmarkov.interfaces.IDeposit;

import java.time.LocalDate;

public class DepositAccount extends BankProduct implements IDeposit {
    private LocalDate openDate;

    public DepositAccount(String name, String currency, double balance) {
        super(name, balance, currency);
        openDate = LocalDate.now();
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void closeAccount() {
        balance = 0;
        //для тестов сделал так, что при закрытии счета, баланс становится нулевым. по сути может быть любая логика
    }
}

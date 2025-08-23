package com.gdcg;

import java.math.BigDecimal;

public class BestAccount {

    private BigDecimal balance;

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

}

package com.gdcg;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance;

    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return this.balance;
    }

}

package com.gdcg.responsability;

import java.math.BigDecimal;
import java.util.UUID;

public class ResponsabiltySample {

    public static void main(String[] args) {
        System.out.println("-- Bad Practice --");
        showBadPractice();

        System.out.println("\n-- Good Practice --");
        showGoodPractice();
    }

    private static void showBadPractice() {
        BadCustomerAccount account = new BadCustomerAccount(UUID.randomUUID().toString(), BigDecimal.valueOf(100.0));
        account.processTransaction("withdraw", BigDecimal.valueOf(10.0));
        account.processTransaction("deposit", BigDecimal.valueOf(50.0));
    }

    private static void showGoodPractice() {
        GoodCustomerAccount account = new GoodCustomerAccount(UUID.randomUUID().toString(), BigDecimal.valueOf(100.0));
        account.withdraw(BigDecimal.valueOf(10.0));
        account.deposit(BigDecimal.valueOf(50.0));
    }

}
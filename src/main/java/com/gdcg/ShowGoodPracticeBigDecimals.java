package com.gdcg;

import java.math.BigDecimal;

public class ShowGoodPracticeBigDecimals {

    public static void main(String[] args) {
        System.out.println("Good Practice");
        showGoodPracticeBigDecimals();
    }

    private static void showGoodPracticeBigDecimals() {
        BigDecimal budgetUsd = new BigDecimal("1.0");
        final BigDecimal itemPriceUsd = new BigDecimal("0.1");

        System.out.println("initial budget: " + budgetUsd);
        System.out.println("item price: " + itemPriceUsd);
        System.out.println("Monbey lsft after buying 9 items: "
                + (budgetUsd.subtract(itemPriceUsd.multiply((new BigDecimal("9.0"))))));
    }

}

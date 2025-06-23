package com.bruno.santana;

import java.math.BigDecimal;

public class Calculator {

    public static BigDecimal sum(BigDecimal n1, BigDecimal n2) {
        return n1.add(n2);
    }

    public static BigDecimal subtract(BigDecimal n1, BigDecimal n2) {
        return n1.subtract(n2);
    }
}

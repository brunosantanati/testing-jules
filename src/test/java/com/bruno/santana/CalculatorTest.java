package com.bruno.santana;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testSum_positiveNumbers() {
        assertEquals(new BigDecimal("5"), Calculator.sum(new BigDecimal("2"), new BigDecimal("3")));
    }

    @Test
    void testSum_negativeNumbers() {
        assertEquals(new BigDecimal("-5"), Calculator.sum(new BigDecimal("-2"), new BigDecimal("-3")));
    }

    @Test
    void testSum_withZero() {
        assertEquals(new BigDecimal("2"), Calculator.sum(new BigDecimal("2"), BigDecimal.ZERO));
        assertEquals(new BigDecimal("-2"), Calculator.sum(new BigDecimal("-2"), BigDecimal.ZERO));
        assertEquals(BigDecimal.ZERO, Calculator.sum(BigDecimal.ZERO, BigDecimal.ZERO));
    }

    @Test
    void testSum_positiveAndNegative() {
        assertEquals(new BigDecimal("-1"), Calculator.sum(new BigDecimal("2"), new BigDecimal("-3")));
        assertEquals(new BigDecimal("1"), Calculator.sum(new BigDecimal("-2"), new BigDecimal("3")));
    }

    @Test
    void testSum_largeNumbers() {
        BigDecimal num1 = new BigDecimal("12345678901234567890.123456789");
        BigDecimal num2 = new BigDecimal("98765432109876543210.987654321");
        BigDecimal expected = new BigDecimal("111111111011111111101.111111110");
        assertEquals(expected, Calculator.sum(num1, num2));
    }

    @Test
    void testSum_manyDecimalPlaces() {
        BigDecimal num1 = new BigDecimal("0.1234567890123456789");
        BigDecimal num2 = new BigDecimal("0.9876543210987654321");
        BigDecimal expected = new BigDecimal("1.1111111101111111110");
        assertEquals(expected, Calculator.sum(num1, num2));
    }

    @Test
    void testSubtract_positiveNumbers() {
        assertEquals(new BigDecimal("-1"), Calculator.subtract(new BigDecimal("2"), new BigDecimal("3")));
        assertEquals(new BigDecimal("1"), Calculator.subtract(new BigDecimal("3"), new BigDecimal("2")));
    }

    @Test
    void testSubtract_negativeNumbers() {
        assertEquals(new BigDecimal("1"), Calculator.subtract(new BigDecimal("-2"), new BigDecimal("-3")));
        assertEquals(new BigDecimal("-1"), Calculator.subtract(new BigDecimal("-3"), new BigDecimal("-2")));
    }

    @Test
    void testSubtract_withZero() {
        assertEquals(new BigDecimal("2"), Calculator.subtract(new BigDecimal("2"), BigDecimal.ZERO));
        assertEquals(new BigDecimal("-2"), Calculator.subtract(BigDecimal.ZERO, new BigDecimal("2")));
        assertEquals(BigDecimal.ZERO, Calculator.subtract(BigDecimal.ZERO, BigDecimal.ZERO));
    }

    @Test
    void testSubtract_positiveAndNegative() {
        assertEquals(new BigDecimal("5"), Calculator.subtract(new BigDecimal("2"), new BigDecimal("-3")));
    }

    @Test
    void testSubtract_negativeAndPositive() {
        assertEquals(new BigDecimal("-5"), Calculator.subtract(new BigDecimal("-2"), new BigDecimal("3")));
    }

    @Test
    void testSubtract_largeNumbers() {
        BigDecimal num1 = new BigDecimal("12345678901234567890.123456789");
        BigDecimal num2 = new BigDecimal("98765432109876543210.987654321");
        BigDecimal expected = new BigDecimal("-86419753208641975320.864197532");
        assertEquals(expected, Calculator.subtract(num1, num2));
    }

    @Test
    void testSubtract_manyDecimalPlaces() {
        BigDecimal num1 = new BigDecimal("0.1234567890123456789");
        BigDecimal num2 = new BigDecimal("0.9876543210987654321");
        BigDecimal expected = new BigDecimal("-0.8641975320864197532");
        assertEquals(expected, Calculator.subtract(num1, num2));
    }
}

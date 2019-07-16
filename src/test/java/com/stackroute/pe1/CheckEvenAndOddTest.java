package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenAndOddTest {
    @Test
    public void givenAIntegerShouldReturnEven() {
        CheckEvenAndOdd checkEvenAndOdd = new CheckEvenAndOdd();
        String actualResult = checkEvenAndOdd.checkEvenAndOdd(22);
        assertEquals("tom", actualResult);
    }
    @Test
    public void givenAIntegerShouldReturnOdd() {
        CheckEvenAndOdd checkEvenAndOdd = new CheckEvenAndOdd();
        String actualResult = checkEvenAndOdd.checkEvenAndOdd(21);
        assertEquals("jerry", actualResult);
    }
    @Test
    public void givenAIntegerShouldReturnNotInRange() {
        CheckEvenAndOdd checkEvenAndOdd = new CheckEvenAndOdd();
        String actualResult = checkEvenAndOdd.checkEvenAndOdd(31);
        assertEquals("not in range", actualResult);
    }
}
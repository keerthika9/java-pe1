package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomjerryTest {
    @Test
    public void givenAStringAndShouldReturnEven() {
        Tomjerry tomjerry = new Tomjerry();
        String actualResult = tomjerry.Tomjerry(22);
        assertEquals("tom", actualResult);
    }
    @Test
    public void givenAStringAndShouldReturnOdd() {
        Tomjerry tomjerry = new Tomjerry();
        String actualResult = tomjerry.Tomjerry(21);
        assertEquals("jerry", actualResult);
    }
    @Test
    public void givenAStringAndShouldReturnNotInRange() {
        Tomjerry tomjerry = new Tomjerry();
        String actualResult = tomjerry.Tomjerry(31);
        assertEquals("not in range", actualResult);
    }
}
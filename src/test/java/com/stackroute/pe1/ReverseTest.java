package com.stackroute.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse reverse;

    @Before
    public void setup() {
        System.out.println("inside before");
        this.reverse = new Reverse();
    }

    @Test
    public void givenAStringAndShouldReturnReverse() {
        String actualResult = reverse.reverse("string");
        assertEquals("gnirts", actualResult);
    }

    @Test
    public void givenAStringAsNullShouldReturnErrorMessage() {
        String actualResult = reverse.reverse(null);
        assertNotNull(actualResult);
        assertEquals("String cannot be null", actualResult);
    }
}
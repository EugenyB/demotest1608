package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testSum() {
        int[] a = {5, 7, 2, 6, 10};
        int expected = 30;
        int result = main.sum(a);
        assertEquals(expected, result);
    }

    @Test
    void testGcd() {
        int a = 1001;
        int b = 39;
        int expected = 13;
        int result = main.gcd(a,b);
        assertEquals(expected, result);
    }
}
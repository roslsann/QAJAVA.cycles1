package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {



    @Test
    void shouldSqr() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int min = 200;
        int max = 300;
        int actual = sqrService.sqrNumber(min,max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqr1000() {
        SQRService sqrService = new SQRService();
        int expected = 22;
        int min = 0;
        int max = 1000;
        int actual = sqrService.sqrNumber(min,max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqr10000() {
        SQRService sqrService = new SQRService();
        int expected = 90;
        int min = 100;
        int max = 10_000;
        int actual = sqrService.sqrNumber(min,max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqr1000000() {
        SQRService sqrService = new SQRService();
        int expected = 90;
        int min = 100;
        int max = 1_000_000;
        int actual = sqrService.sqrNumber(min,max);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqr0() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int min = 0;
        int max = 100;
        int actual = sqrService.sqrNumber(min, max);
        assertEquals(expected, actual);
    }
}
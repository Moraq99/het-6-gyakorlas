package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220402_03Test {

    @Test
    public void getTemperatureData() {
        assertArrayEquals(new int[] {11}, Practice_20220402_03.getTemperatureData(1, 0, 0));
        assertArrayEquals(new int[] {18, 7, -7}, Practice_20220402_03.getTemperatureData(1, 1, 3));
        assertArrayEquals(new int[] {26, 30}, Practice_20220402_03.getTemperatureData(2, 27, 28));
    }

    @Test
    public void getSnowyDays() {
        assertEquals(4, Practice_20220402_03.getSnowyDays(3));
    }

    @Test
    public void getTotalSnow() {
        assertEquals(333, Practice_20220402_03.getTotalSnow(3));
    }
}
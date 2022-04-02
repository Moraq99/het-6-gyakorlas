package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220402_02Test {

    @Test
    public void getTemperatureData() {
        int[] data1 = Gigapolis.getTemperature()[0];
        int[] data2 = Gigapolis.getTemperature()[1];
        int[] data3 = Gigapolis.getTemperature()[2];

        assertArrayEquals(data1, Practice_20220402_02.getTemperatureData(1));
        assertArrayEquals(data2, Practice_20220402_02.getTemperatureData(2));
        assertArrayEquals(data3, Practice_20220402_02.getTemperatureData(3));
    }

    @Test
    public void getMaxTemperatureByDistrict() {
        assertEquals(30, Practice_20220402_02.getMaxTemperatureByDistrict(1));
        assertEquals(29, Practice_20220402_02.getMaxTemperatureByDistrict(2));
        assertEquals(29, Practice_20220402_02.getMaxTemperatureByDistrict(3));
    }

    @Test
    public void getMinTemperatureByDistrict() {
        assertEquals(-10, Practice_20220402_02.getMinTemperatureByDistrict(1));
        assertEquals(-10, Practice_20220402_02.getMinTemperatureByDistrict(2));
        assertEquals(-10, Practice_20220402_02.getMinTemperatureByDistrict(3));
    }

    @Test
    public void getWarmestDistrict() {
        int district = Practice_20220402_02.getWarmestDistrict();
        assertEquals(1, district);
    }

    @Test
    public void getColdestDistrict() {
        int district = Practice_20220402_02.getColdestDistrict();
        assertTrue(district >= 1 && district <= 3);
    }

    @Test
    public void getFreezyDays() {
        assertEquals(4, Practice_20220402_02.getFreezyDays(1));
        assertEquals(10, Practice_20220402_02.getFreezyDays(2));
        assertEquals(8, Practice_20220402_02.getFreezyDays(3));
    }

    @Test
    public void getWarmDays() {
        assertEquals(6, Practice_20220402_02.getWarmDays(1));
        assertEquals(4, Practice_20220402_02.getWarmDays(2));
        assertEquals(3, Practice_20220402_02.getWarmDays(3));
    }

    @Test
    public void getWarmestDay() {
        // TDD - Test Driven Development
        assertEquals(30, Practice_20220402_02.getWarmestDay());
    }
}
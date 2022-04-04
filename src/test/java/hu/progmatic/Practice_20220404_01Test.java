package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220404_01Test {

    @Test
    public void getMinTemperature() {
        assertEquals(-4, Practice_20220404_01.getMinTemperature(
                new int[] {10, 23, -4, 33}
        ));
    }

    @Test
    public void isTemperatureLinearDecreasing() {
        assertTrue(Practice_20220404_01.isTemperatureLinearDecreasing(
                new int[] {3, 2, 1}
        ));
        assertFalse(Practice_20220404_01.isTemperatureLinearDecreasing(
                new int[] {1, 2, 1}
        ));
    }
}
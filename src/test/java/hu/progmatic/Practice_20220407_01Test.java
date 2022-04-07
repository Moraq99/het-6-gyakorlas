package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220407_01Test {

    @Test
    public void doWeHaveAppleFood() {
        assertTrue(Practice_20220407_01.doWeHaveAppleFood(new String[] {"cherry", "applepie"}));
        assertTrue(Practice_20220407_01.doWeHaveAppleFood(new String[] {"cherry", "candyapple"}));
        assertFalse(Practice_20220407_01.doWeHaveAppleFood(new String[] {"cherry", "sugar"}));
    }

    @Test
    public void cheapestFoodMoreExpensiveThan() {
        assertEquals(1200, Practice_20220407_01.cheapestFoodMoreExpensiveThan(new int[] {
                800, 900, 1200, 1550, 1320, 600, 999
        }, 1000));
        assertEquals(1000, Practice_20220407_01.cheapestFoodMoreExpensiveThan(new int[] {
                800, 900, 1200, 1550, 1320, 1000, 999, 600
        }, 1000));
    }
}
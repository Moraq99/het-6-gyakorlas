package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220404_03Test {

    @Test
    public void getMinimumTurns() {
        assertEquals(21, Practice_20220404_03.getMinimumTurns(1000, 200));
    }

    @Test
    public void getSafeTime() {
        assertEquals(3, Practice_20220404_03.getSafeTime(1000, 200));
    }

    @Test
    public void getBusyDays() {
        assertEquals(3, Practice_20220404_03.getBusyDays(new int[] {10, 20, 100, 300, 200, 55, 55}));
    }

    @Test
    public void getIncreases() {
        assertEquals(3, Practice_20220404_03.getIncreases(new int[] {10, 20, 100, 300, 200, 55, 55}));
    }

    @Test
    public void getMaxTraffic() {
        assertEquals(300, Practice_20220404_03.getIncreases(new int[] {10, 20, 100, 300, 200, 55, 55}));
    }

    @Test
    public void getMaxIncrease() {
        assertEquals(200, Practice_20220404_03.getIncreases(new int[] {10, 20, 100, 300, 200, 55, 55}));
    }

    @Test
    public void findTrafficGreaterThan() {
        assertTrue(Practice_20220404_03.findTrafficGreaterThan(new int[] {10, 20, 100, 300, 200, 55, 55}, 299));
        assertFalse(Practice_20220404_03.findTrafficGreaterThan(new int[] {10, 20, 100, 300, 200, 55, 55}, 300));
    }
}
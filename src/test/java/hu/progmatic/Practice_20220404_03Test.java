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

    @Test
    public void getGigapolisMailNumber() {
        assertEquals(3, Practice_20220404_03.getGigapolisMailNumber(new String[] {
                "GIGAPOLIS123",
                "123GIGAPOLIS",
                "AAAGIGAPOLISBBB",
                "123GIGAPOLI"
        }));
    }

    @Test
    public void sortTraffic() {
        int[] traffic = {100, 80, 90, 70, 20};
        assertArrayEquals(new int[] {20, 70, 80, 90, 100}, Practice_20220404_03.sortTraffic(traffic));
        assertArrayEquals(new int[] {100, 80, 90, 70, 20}, traffic);

    }
}
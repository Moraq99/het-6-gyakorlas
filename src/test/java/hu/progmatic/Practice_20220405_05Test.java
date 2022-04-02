package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220405_05Test {

    @Test
    public void getFirstDayWarmerThan() {
        assertEquals(0, Practice_20220405_05.getFirstDayWarmerThan(1, 10));
        assertEquals(1, Practice_20220405_05.getFirstDayWarmerThan(1, 11));
        assertEquals(28, Practice_20220405_05.getFirstDayWarmerThan(1, 30));
    }

    @Test
    public void getFirstDayColderThan() {
        assertEquals(0, Practice_20220405_05.getFirstDayColderThan(1, 12));
        assertEquals(2, Practice_20220405_05.getFirstDayColderThan(1, 10));
        assertEquals(3, Practice_20220405_05.getFirstDayColderThan(1, 0));
    }

    @Test
    public void getPrecipitationTotalAtLeast() {
        assertEquals(2, Practice_20220405_05.getPrecipitationTotalAtLeast(1, 0, 96));
        assertEquals(4, Practice_20220405_05.getPrecipitationTotalAtLeast(1, 3, 15));
        assertEquals(4, Practice_20220405_05.getPrecipitationTotalAtLeast(1, 2, 100));
    }
}
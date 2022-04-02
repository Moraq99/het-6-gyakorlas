package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220402_07Test {

    @Test
    public void getTemperaturesSorted() {
        assertArrayEquals(
                new int[0],
                Practice_20220402_07.getTemperaturesSorted(new int[0])
        );
        int[] original = new int[] {10, 5, 0, -5};
        assertArrayEquals(
                new int[] {-5, 0, 5, 10},
                Practice_20220402_07.getTemperaturesSorted(original)
        );
        assertArrayEquals(new int[] {10, 5, 0, -5}, original);
    }

    @Test
    public void getRainyDays() {
        assertEquals(13, Practice_20220402_07.getRainyDays(1));
        assertEquals(11, Practice_20220402_07.getRainyDays(2));
        assertEquals(12, Practice_20220402_07.getRainyDays(3));
    }

    @Test
    public void getRainTotal() {
        assertEquals(1942, Practice_20220402_07.getRainTotal());
    }

    @Test
    public void getFirstBigChangeFrom() {
        assertEquals(1, Practice_20220402_07.getFirstBigChangeFrom(1, 0));
        assertEquals(10, Practice_20220402_07.getFirstBigChangeFrom(2, 10));
        assertEquals(18, Practice_20220402_07.getFirstBigChangeFrom(3, 16));
        assertEquals(29, Practice_20220402_07.getFirstBigChangeFrom(1, 28));
    }

    @Test
    public void getTemperatureFromDescription() {
        assertEquals(-273, Practice_20220402_07.getTemperatureFromDescription("FREEZY"));
        assertEquals(-5, Practice_20220402_07.getTemperatureFromDescription("COLD"));
        assertEquals(6, Practice_20220402_07.getTemperatureFromDescription("MILD"));
        assertEquals(21, Practice_20220402_07.getTemperatureFromDescription("WARM"));
        assertEquals(31, Practice_20220402_07.getTemperatureFromDescription("HOT"));
    }

    @Test
    public void getDescriptionFromTemperature() {
        assertEquals("FREEZY", Practice_20220402_07.getDescriptionFromTemperature(-8));
        assertEquals("COLD", Practice_20220402_07.getDescriptionFromTemperature(-5));
        assertEquals("MILD", Practice_20220402_07.getDescriptionFromTemperature(6));
        assertEquals("MILD", Practice_20220402_07.getDescriptionFromTemperature(20));
        assertEquals("WARM", Practice_20220402_07.getDescriptionFromTemperature(25));
        assertEquals("WARM", Practice_20220402_07.getDescriptionFromTemperature(30));
        assertEquals("HOT", Practice_20220402_07.getDescriptionFromTemperature(31));
        assertEquals("HOT", Practice_20220402_07.getDescriptionFromTemperature(40));
    }

    @Test
    public void getChangeDescription() {
        assertEquals("INCREASE", Practice_20220402_07.getChangeDescription(1, 0));
        assertEquals("DECREASE", Practice_20220402_07.getChangeDescription(1, 1));
    }

    @Test
    public void isTemperatureIncreasing() {
        assertTrue(Practice_20220402_07.isTemperatureIncreasing(1, 0));
        assertFalse(Practice_20220402_07.isTemperatureIncreasing(1, 1));
    }
}
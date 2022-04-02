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
        assertArrayEquals(
                new int[] {-5, 0, 5, 10},
                Practice_20220402_07.getTemperaturesSorted(new int[] {10, 5, 0, -5})
        );
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
    }

    @Test
    public void getTemperatureFromDescription() {
    }

    @Test
    public void getDescriptionFromTemperature() {
    }

    @Test
    public void getChangeDescription() {
    }

    @Test
    public void isTemperatureIncreasing() {
    }
}
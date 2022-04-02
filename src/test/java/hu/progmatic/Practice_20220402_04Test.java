package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220402_04Test {
    @Test
    public void getDatesColdestToWarmest() {
        String[] dates = {
                "2250.01.04.",
                "2250.01.03.",
                "2250.01.01.",
                "2250.01.06.",
                "2250.01.02.",
                "2250.01.07.",
                "2250.01.05."
        };
        assertArrayEquals(dates, Practice_20220402_04.getDatesColdestToWarmest(1, 0, 6));
    }
}
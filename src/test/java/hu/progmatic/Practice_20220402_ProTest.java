package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220402_ProTest {

    @Test
    public void getMinCost() {
        assertEquals(0, Practice_20220402_Pro.getMinCost(0, 0));
        assertEquals(9, Practice_20220402_Pro.getMinCost(1, 3));
        assertEquals(61, Practice_20220402_Pro.getMinCost(0, 3));
    }
}
package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220404_02Test {

    @Test
    public void doBoxesFit() {
        assertTrue(Practice_20220404_02.doBoxesFit(2, 2, 2));
        assertTrue(Practice_20220404_02.doBoxesFit(4, 2, 2));
        assertTrue(Practice_20220404_02.doBoxesFit(3, 3, 6));
        assertTrue(Practice_20220404_02.doBoxesFit(1, 3, 2));
        assertFalse(Practice_20220404_02.doBoxesFit(1, 3, 6));
        assertFalse(Practice_20220404_02.doBoxesFit(2, 2, 3));
        assertFalse(Practice_20220404_02.doBoxesFit(2, 6, 3));
    }

    @Test
    public void getPostageFee() {
        assertEquals(100, Practice_20220404_02.getPostageFee(10));
        assertEquals(200, Practice_20220404_02.getPostageFee(11));
        assertEquals(200, Practice_20220404_02.getPostageFee(20));
        assertEquals(300, Practice_20220404_02.getPostageFee(21));
        assertEquals(300, Practice_20220404_02.getPostageFee(100));
        assertEquals(400, Practice_20220404_02.getPostageFee(101));
        assertEquals(400, Practice_20220404_02.getPostageFee(200));
        assertEquals(500, Practice_20220404_02.getPostageFee(201));
    }

    @Test
    public void getLowerBound() {
        assertEquals(0, Practice_20220404_02.getLowerBound("s"));
        assertEquals(10, Practice_20220404_02.getLowerBound("m"));
        assertEquals(20, Practice_20220404_02.getLowerBound("l"));
        assertEquals(100, Practice_20220404_02.getLowerBound("xl"));
        assertEquals(-1, Practice_20220404_02.getLowerBound("z"));
    }

    @Test
    public void isExpress() {
        assertTrue(Practice_20220404_02.isExpress("    EX123   "));
        assertTrue(Practice_20220404_02.isExpress("EX123   "));
        assertTrue(Practice_20220404_02.isExpress("    E123EX   "));
        assertTrue(Practice_20220404_02.isExpress("    E123EX"));
        assertFalse(Practice_20220404_02.isExpress("    E123E"));
        assertFalse(Practice_20220404_02.isExpress("    E123EX2"));
    }

    @Test
    public void isOutgoing() {

    }

    @Test
    public void isTransit() {
    }

    @Test
    public void getAverageLast3Days() {
    }
}
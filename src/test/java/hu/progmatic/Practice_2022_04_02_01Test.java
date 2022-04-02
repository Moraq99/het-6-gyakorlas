package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_2022_04_02_01Test {

    @Test
    public void getFirstTemperatureDistrictI() {
        assertEquals(11, Practice_2022_04_02_01.getFirstTemperatureDistrictI());
    }

    @Test
    public void getTemperatureDistrictI() {
        assertEquals(11, Practice_2022_04_02_01.getTemperatureDistrictI(0));
        assertEquals(-7, Practice_2022_04_02_01.getTemperatureDistrictI(3));
        assertEquals(31, Practice_2022_04_02_01.getTemperatureDistrictI(28));
    }

    @Test
    public void getMidnightTemperatureDistrictII() {
        assertEquals(14, Practice_2022_04_02_01.getMidnightTemperatureDistrictII(0));
        assertEquals(3, Practice_2022_04_02_01.getMidnightTemperatureDistrictII(3));
        assertEquals(34, Practice_2022_04_02_01.getMidnightTemperatureDistrictII(28));
    }

    @Test
    public void getWindSpeedByWarning() {
        assertEquals(0, Practice_2022_04_02_01.getWindSpeedByWarning("ALAPFOK"));
        assertEquals(22, Practice_2022_04_02_01.getWindSpeedByWarning("ELSŐFOK"));
        assertEquals(33, Practice_2022_04_02_01.getWindSpeedByWarning("MÁSODFOK"));
    }

    @Test
    public void getWarningByWindSpeed() {
        assertEquals("ALAPFOK", Practice_2022_04_02_01.getWarningByWindSpeed(0));
        assertEquals("ALAPFOK", Practice_2022_04_02_01.getWarningByWindSpeed(21));
        assertEquals("ELSŐFOK", Practice_2022_04_02_01.getWarningByWindSpeed(22));
        assertEquals("ELSŐFOK", Practice_2022_04_02_01.getWarningByWindSpeed(32));
        assertEquals("MÁSODFOK", Practice_2022_04_02_01.getWarningByWindSpeed(33));
    }
}
package hu.progmatic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Practice_20220402_06Test {
    @Test
    public void getTemperatureFromForecast() {
        assertEquals(10, Practice_20220402_06.getTemperatureFromForecast("ALFA0101;2251.01.01.;10;5"));
        assertEquals(-1, Practice_20220402_06.getTemperatureFromForecast("BETA0101;2251.03.01.;-1;5"));
    }

    @Test
    public void isAlfaForecast() {
        assertTrue(Practice_20220402_06.isAlfaForecast("ALFA0101;2251.01.01.;10;5"));
        assertFalse(Practice_20220402_06.isAlfaForecast("BETA0101;2251.03.01.;-1;5"));
    }

    @Test
    public void getMonthFromForecast() {
        assertEquals("225101", Practice_20220402_06.getMonthFromForecast("ALFA0101;2251.01.01.;10;5"));
        assertEquals("225103", Practice_20220402_06.getMonthFromForecast("BETA0101;2251.03.01.;-1;5"));
    }

    @Test
    public void getAlfaForecastCount() {
        assertEquals(28, Practice_20220402_06.getAlfaForecastCount());
    }

    @Test
    public void getBetaMaxPrecipitation() {
        assertEquals(90, Practice_20220402_06.getBetaMaxPrecipitation());
    }
}
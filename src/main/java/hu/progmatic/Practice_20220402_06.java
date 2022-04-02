package hu.progmatic;

public class Practice_20220402_06 {
    /**
     * Egy előrejelzésből visszadja az adott napra vonatkozó hőmérsékletet
     * pl. "ALFA0101;2250.01.01.;10;5" -> 10
     * @param forecast előrejelzés
     * @return hőmérséklet
     */
    public static int getTemperatureFromForecast(String forecast) {
        return 0;
    }

    /**
     * Az ALFA meteorológiai szolgálat készítette-e az előrejelzést?
     * @param forecast előrejelzés
     * @return az ALFA meteorológiai szolgálat készítette-e az előrejelzést?
     */
    public static boolean isAlfaForecast(String forecast) {
        return false;
    }

    /**
     * Egy előrejelzésből visszaadja a hónapot (pl. "225001").
     * @param forecast előrejelzés
     * @return hónap szövegesen
     */
    public static String getMonthFromForecast(String forecast) {
        return null;
    }

    /**
     * Visszaadja az ALFA szolgálat által készített előrejelzések számát.
     * @return előrejelzések száma
     */
    public static int getAlfaForecastCount() {
        return 0;
    }

    /**
     * Visszaadja a BETA szolgálat által előrejelzett maximum csapadékot.
     * @return maximum csapadék
     */
    public static int getBetaMaxPrecipitation() {
        return 0;
    }
}

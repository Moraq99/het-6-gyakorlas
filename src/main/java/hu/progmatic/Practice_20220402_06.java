package hu.progmatic;

public class Practice_20220402_06 {
    /**
     * Egy előrejelzésből visszadja az adott napra vonatkozó hőmérsékletet
     * pl. "ALFA0101;2250.01.01.;10;5" -> 10
     * @param forecast előrejelzés
     * @return hőmérséklet
     */
    public static int getTemperatureFromForecast(String forecast) {
        String[] fields = forecast.split(";");
        return Integer.parseInt(fields[2]);
    }

    /**
     * Az ALFA meteorológiai szolgálat készítette-e az előrejelzést?
     * @param forecast előrejelzés
     * @return az ALFA meteorológiai szolgálat készítette-e az előrejelzést?
     */
    public static boolean isAlfaForecast(String forecast) {
        return forecast.startsWith("ALFA");
    }

    /**
     * Egy előrejelzésből visszaadja a hónapot (pl. "225001").
     * @param forecast előrejelzés
     * @return hónap szövegesen
     */
    public static String getMonthFromForecast(String forecast) {
        String[] fields = forecast.split(";");
        return fields[1].substring(0, 4) + fields[1].substring(5, 7);
    }

    /**
     * Visszaadja az ALFA szolgálat által készített előrejelzések számát.
     * @return előrejelzések száma
     */
    public static int getAlfaForecastCount() {
        String[] forecasts = Gigapolis.getForecasts();
        int counter = 0;

        for (String forecast : forecasts) {
            if (forecast.startsWith("ALFA")) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Visszaadja a BETA szolgálat által előrejelzett maximum csapadékot.
     * @return maximum csapadék
     */
    public static int getBetaMaxPrecipitation() {
        String[] forecasts = Gigapolis.getForecasts();
        int max = Integer.MIN_VALUE;

        for (String forecast : forecasts) {
            if (forecast.startsWith("BETA")) {
                String[] fields = forecast.split(";");
                int precipitation = Integer.parseInt(fields[3]);

                if (precipitation > max) {
                    max = precipitation;
                }
            }
        }

        return max;
    }
}

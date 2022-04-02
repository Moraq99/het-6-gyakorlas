package hu.progmatic;

public class Practice_20220402_01 {
    /**
     * Az I. kerületben 2250.01.01. 00:00-kor mért hőmérsékletet visszaadó metódus.
     * @return mért hőmérséklet
     */
    public static int getFirstTemperatureDistrictI() {
        int[][] data = Gigapolis.getTemperature();
        return data[0][0];
    }

    /**
     * Az I. kerületben bármelyik napon 00:00-kor mért hőmérsékletet visszaadó metódus.
     * A tömböt visszaadó metódus csak 2250.01.28-ig adja vissza a hőmérsékleteket.
     * @param day 2250.01.01. óta eltelt napok száma (2250.01.01. = 0)
     * @return mért hőmérséklet
     */
    public static int getTemperatureDistrictI(int day) {
        return Gigapolis.getTemperature(1, day);
    }

    /**
     * A II. kerületben a megadott napon 24:00-kor mért hőmérsékletet visszaadó metódus.
     * @param day 2250.01.01. óta eltelt napok száma (2250.01.01. = 0)
     * @return mért hőmérséklet
     */
    public static int getMidnightTemperatureDistrictII(int day) {
        return 0;
    }

    /**
     * Az adott fokozatú viharjelzéshez tartozó szél minimális sebességét visszaadó metódus.
     * - ALAPFOK: 0
     * - ELSŐFOK: 22
     * - MÁSODFOK: 33
     * @param warning viharjelzés
     * @return szél minimális sebessége csomóban
     */
    public static int getWindSpeedByWarning(String warning) {
        return 0;
    }

    /**
     * Az adott erősségű szélhez tartozó viharjelzést visszaadó metódus.
     * @param windSpeed szél sebessége
     * @return viharjelzés
     */
    public static String getWarningByWindSpeed(int windSpeed) {
        return null;
    }
}

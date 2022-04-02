package hu.progmatic;

public class Practice_20220402_02 {
    /**
     * Az adott kerülethez tartozó történelmi adatokat visszaadó metódus.
     * @param district a kerület száma (I. = 1)
     * @return az első 4 hét hőmérsékletei
     */
    public static int[] getTemperatureData(int district) {
        int[][] data = Gigapolis.getTemperature();
        return data[district - 1];
    }

    /**
     * Az első 4 hét legmagasabb hőmérsékletét visszaadó metódus.
     * @param district a kerület száma (I. = 1)
     * @return a legmagasabb hőmérséklet
     */
    public static int getMaxTemperatureByDistrict(int district) {
        int[][] data = Gigapolis.getTemperature();
        int[] districtData = data[district - 1];

        int max = Integer.MIN_VALUE;

        for (int temperature : districtData) {
            if (temperature > max) {
                max = temperature;
            }
        }

        return max;
    }

    /**
     * Az első 4 hét legalacsonyabb hőmérsékletét visszaadó metódus.
     * @param district a kerület száma (I. = 1)
     * @return a legalacsonyabb hőmérséklet
     */
    public static int getMinTemperatureByDistrict(int district) {
        int[][] data = Gigapolis.getTemperature();
        int[] districtData = data[district - 1];

        int min = Integer.MAX_VALUE;

        for (int temperature : districtData) {
            if (temperature < min) {
                min = temperature;
            }
        }

        return min;
    }

    /**
     * Az első 4 hét során melyik körzetben mérték a legmagasabb hőmérsékletet?
     * @return körzet száma
     */
    public static int getWarmestDistrict() {
        int max = Integer.MIN_VALUE;
        int district = -1;

        for (int i = 1; i <= 3; i++) {
            int districtMax = getMaxTemperatureByDistrict(i);

            if (districtMax > max) {
                max = districtMax;
                district = i;
            }
        }

        return district;
    }

    /**
     * Az első 4 hét során melyik körzetben mérték a legalacsonyabb hőmérsékletet?
     * @return körzet száma
     */
    public static int getColdestDistrict() {
        int min = Integer.MAX_VALUE;
        int district = -1;

        for (int i = 1; i <= 3; i++) {
            int districtMin = getMinTemperatureByDistrict(i);

            if (districtMin < min) {
                min = districtMin;
                district = i;
            }
        }

        return district;
    }

    /**
     * Az első 4 hét során hány fagyos nap (hőmérséklet < 0) volt a megadott körzetben?
     * @param district a kerület száma (I. = 1)
     * @return fagyos napok számq
     */
    public static int getFreezyDays(int district) {
        int[][] data = Gigapolis.getTemperature();
        int[] districtData = data[district - 1];
        int freezyDays = 0;

        for (int temperature : districtData) {
            if (temperature < 0) {
                freezyDays++;
            }
        }

        return freezyDays;
    }

    /**
     * Az első 4 hét során hány forró nap (hőmérséklet >= 25) volt a megadott körzetben?
     * @param district a kerület száma (I. = 1)
     * @return forró napok száma
     */
    public static int getWarmDays(int district) {
        int[][] data = Gigapolis.getTemperature();
        int[] districtData = data[district - 1];
        int warmDays = 0;

        for (int temperature : districtData) {
            if (temperature >= 25) {
                warmDays++;
            }
        }

        return warmDays;
    }
}

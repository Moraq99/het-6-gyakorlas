package hu.progmatic;

public class Practice_20220404_01 {
    /**
     * Készítsünk egy metódust, amelyik visszaadja a legkisebb hőmérsékletet.
     * @param temperatures hőmérsékletek
     * @return legkisebb érték
     */
    public static int getMinTemperature(int[] temperatures) {
        int min = Integer.MAX_VALUE;

        /* for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];

            if (temperature < min) {
                min = temperature;
            }
        } */

        for (int temperature : temperatures) {
            if (temperature < min) {
                min = temperature;
            }
        }

        return min;
    }

    public static boolean isTemperatureLinearDecreasing(int[] temperatures) {
        for (int i = 0; i < temperatures.length - 1; i++) {
            if (temperatures[i] < temperatures[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

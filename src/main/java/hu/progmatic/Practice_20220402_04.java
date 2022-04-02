package hu.progmatic;

public class Practice_20220402_04 {
    /**
     * A metódus növekvő sorrendben adja vissza a hőmérsékleteket.
     * Csak az első 4 hét adatait kell kezelni.
     * @param district a kerület száma (I. = 1)
     * @param dayFrom 2250.01.01. óta eltelt napok száma (2022.01.01. = 0) beletartozik az intrvallumba
     * @param dayTo 2250.01.01. óta eltelt napok száma (2022.01.01. = 0) beletartozik az intervallumba
     * @return hőmérsékletek növekvő sorrendben
     */
    public static int[] getTemperaturesColdestToWarmest(int district, int dayFrom, int dayTo) {
        int[][] data = Gigapolis.getTemperature();
        int[] districtData = data[district - 1];

        // COPY
        int[] temperatures = new int[dayTo - dayFrom + 1];

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = districtData[dayFrom + i];
        }

        // SORT
        for (int i = 0; i < temperatures.length - 1; i++) {
            boolean sorted = true;

            for (int j = 0; j < temperatures.length - i - 1; j++) {
                if (temperatures[j] > temperatures[j + 1]) {
                    int swap = temperatures[j];
                    temperatures[j] = temperatures[j + 1];
                    temperatures[j + 1] = swap;
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }

        return temperatures;
    }

    /**
     * Hőmérséklet szerint növekvő sorrendben adja vissza a dátumokat.
     * Csak az első 4 hét adatait kell kezelni (rendelkezésre áll a dátumok tömb).
     * @param district a kerület száma (I. = 1)
     * @param dayFrom 2250.01.01. óta eltelt napok száma (2022.01.01. = 0) beletartozik az intrvallumba
     * @param dayTo 2250.01.01. óta eltelt napok száma (2022.01.01. = 0) beletartozik az intervallumba
     * @return dátumok hőmérséklet szerint növekvő sorrendben
     */
    public static String[] getDatesColdestToWarmest(int district, int dayFrom, int dayTo) {
        int[][] data = Gigapolis.getTemperature();
        int[] districtData = data[district - 1];
        String[] allDates = Gigapolis.getDates();

        // COPY
        int[] temperatures = new int[dayTo - dayFrom + 1];
        String[] dates = new String[dayTo - dayFrom + 1];

        for (int i = 0; i < temperatures.length; i++) {
            // hőmérsékletek másolása
            temperatures[i] = districtData[dayFrom + i];
            // dátumok másolása
            dates[i] = allDates[dayFrom + i];
        }

        // SORT
        for (int i = 0; i < temperatures.length - 1; i++) {
            boolean sorted = true;

            for (int j = 0; j < temperatures.length - i - 1; j++) {
                if (temperatures[j] > temperatures[j + 1]) {
                    // hőmérséklet cseréje
                    int swap = temperatures[j];
                    temperatures[j] = temperatures[j + 1];
                    temperatures[j + 1] = swap;

                    // dátum cseréje
                    String swapDate = dates[j];
                    dates[j] = dates[j + 1];
                    dates[j + 1] = swapDate;

                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }

        return dates;
    }
}

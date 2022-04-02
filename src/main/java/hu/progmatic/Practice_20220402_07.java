package hu.progmatic;

public class Practice_20220402_07 {
    /**
     * Hőmérsékleteket rendezve visszaadó metódus.
     * @param temperatures rendezetlen hőmérsékletek
     * @return hőmérsékletek rendezve
     */
    public static int[] getTemperaturesSorted(int[] temperatures) {
        int[] clone = temperatures.clone();

        for (int i = 0; i < clone.length - 1; i++) {
            boolean sorted = true;

            for (int j = 0; j < clone.length - i - 1; j++) {
                if (clone[j] > clone[j + 1]) {
                    int swap = clone[j];
                    clone[j] = clone[j + 1];
                    clone[j + 1] = swap;
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }

        return clone;
    }

    /**
     * Az esős napok számát visszaadó metódus.
     * Csak az első 4 hetet kell figyelembe venni.
     * Azok a napok számítanak esősnek, amikor a hőmérséklet >= 0 és van csapadék.
     * @param district körzet száma (I. = 1)
     * @return esős napok száma
     */
    public static int getRainyDays(int district) {
        int[][] temperatureData = Gigapolis.getTemperature();
        int[] districtTemperature = temperatureData[district - 1];
        int[][] precipitationData = Gigapolis.getPrecipitation();
        int[] districtPrecipitation = precipitationData[district - 1];

        int rainyDays = 0;

        for (int i = 0; i < districtTemperature.length; i++) {
            if (districtTemperature[i] >= 0 && districtPrecipitation[i] > 0) {
                rainyDays++;
            }
        }

        return rainyDays;
    }

    /**
     * A teljes városban leesett eső összegét visszaadó metódus.
     * Csak az első 4 hetet kell figyelembe venni.
     * @return
     */
    public static int getRainTotal() {
        int[][] temperatureData = Gigapolis.getTemperature();
        int[][] precipitationData = Gigapolis.getPrecipitation();

        int rainTotal = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            for (int j = 0; j < temperatureData[i].length; j++) {
                if (temperatureData[i][j] >= 0 && precipitationData[i][j] > 0) {
                    rainTotal += precipitationData[i][j];
                }
            }
        }

        return rainTotal;
    }

    /**
     * Az adott kerületben az első legalább 10 fokos változást megkereső metódus.
     * A metódusnak szükség esetén az első 4 hét után is keresnie kell.
     * @param district körzet száma (I. = 1)
     * @param day kezdő nap
     * @return első olyan nap indexe, amikor legalább 10 fokot változott a hőmérséklet az előző naphoz képest
     */
    public static int getFirstBigChangeFrom(int district, int day) {
        int index = day;
        int change;

        do {
            change = Gigapolis.getTemperature(district, index)
                    - Gigapolis.getTemperature(district, index + 1);
            change = Math.abs(change);

            if (change < 10) {
                index++;
            }
        } while (change < 10);

        return index;
    }

    /**
     * Az adott leíráshoz tartozó legalacsonyabb hőmérsékletet visszaadó metódus.
     * - FREEZY: -5 alatt (ebben az esetben -273-t kell visszaadni)
     * - COLD: 6 alatt
     * - MILD: 21 alatt
     * - WARM: 21 és 30 között
     * - HOT: 31-től
     *
     * @param description leírás
     * @return adott leíráshoz tartozó legalacsonyabb hőmérséklet
     */
    public static int getTemperatureFromDescription(String description) {
        switch (description) {
            case "FREEZY":
                return -273;
            case "COLD":
                return -5;
            case "MILD":
                return 6;
            case "WARM":
                return 21;
            case "HOT":
                return 31;
            default:
                return -1;
        }
    }

    /**
     * A metódus egy hőmérséklet alapján visszaadja a hozzá tartozó leírást.
     * @param temperature hőmérséklet
     * @return leírás
     */
    public static String getDescriptionFromTemperature(int temperature) {
        if (temperature < -5) {
            return "FREEZY";
        } else if (temperature < 6) {
            return "COLD";
        } else if (temperature < 21) {
            return "MILD";
        } else if (temperature < 31) {
            return "WARM";
        } else {
            return "HOT";
        }
    }

    /**
     * A metódus egy adott napon belüli változás típusát adja vissza.
     * - DECREASE
     * - INCREASE
     * - STAGNATION
     *
     * @param district körzet
     * @param day nap
     * @return változás típusa
     */
    public static String getChangeDescription(int district, int day) {
        int morning = Gigapolis.getTemperature(district, day);
        int evening = Gigapolis.getTemperature(district, day + 1);

        if (morning > evening) {
            return "DECREASE";
        } else if (morning < evening) {
            return "INCREASE";
        } else {
            return "STAGNATION";
        }
    }

    /**
     * A metódus igazzala tér vissza, ha 00:00 és 24:00 között növekedett a hőmérséklet.
     * @param district körzet
     * @param day nap
     * @return igaz, ha növekedett a hőmérséklet
     */
    public static boolean isTemperatureIncreasing(int district, int day) {
        int morning = Gigapolis.getTemperature(district, day);
        int evening = Gigapolis.getTemperature(district, day + 1);

        return morning < evening;
    }
}

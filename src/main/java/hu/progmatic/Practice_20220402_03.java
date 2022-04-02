package hu.progmatic;

import java.util.Arrays;

public class Practice_20220402_03 {
    /**
     * Az adott kerülethez tartozó adatsort visszaadó metódus.
     * Nem csak az első 28 napot kell kezelnie.
     * @param district a kerület száma (I. = 1)
     * @param dayFrom 2250.01.01. óta eltelt napok száma (2022.01.01. = 0) beletartozik az intrvallumba
     * @param dayTo 2250.01.01. óta eltelt napok száma (2022.01.01. = 0) beletartozik az intervallumba
     * @return adatsor
     */
    public static int[] getTemperatureData(int district, int dayFrom, int dayTo) {
        int[] temperatures = new int[dayTo - dayFrom + 1];

        for (int i = dayFrom; i <= dayTo; i++) {
            temperatures[i - dayFrom] = Gigapolis.getTemperature(district, i);
        }

        return temperatures;

        // Arrays.copyOf([...]);
    }

    /**
     * Havas napok számát visszaadó metódus.
     * Az első 4 hét adatait kell feldolgoznia.
     * Egy nap akkor havas, ha volt csapadék és a hőmérséklet < 0.
     * @param district a kerület száma (I. = 1)
     * @return havas napok száma
     */
    public static int getSnowyDays(int district) {
        int[][] temperatureData = Gigapolis.getTemperature();
        int[][] precipitationData = Gigapolis.getPrecipitation();

        int snowyDays = 0;

        for (int i = 0; i < temperatureData[district - 1].length; i++) {
            if (temperatureData[district - 1][i] < 0 && precipitationData[district - 1][i] > 0) {
                snowyDays++;
            }
        }

        return snowyDays;
    }

    /**
     * Az összes leesett hót visszaadó metódus.
     * Az első 4 hét adatait kell feldolgoznia.
     * @param district a kerület száma (I. = 1)
     * @return összes leesett hó
     */
    public static int getTotalSnow(int district) {
        int[][] temperatureData = Gigapolis.getTemperature();
        int[][] precipitationData = Gigapolis.getPrecipitation();

        int totalSnow = 0;

        for (int i = 0; i < temperatureData[district - 1].length; i++) {
            // csapadék nagyobb nullát nem kell ellenőrizni, mivel +0 nem okoz gondot
            if (temperatureData[district - 1][i] < 0 && precipitationData[district - 1][i] > 0) {
                totalSnow += precipitationData[district - 1][i];
            }
        }

        return totalSnow;
    }
}

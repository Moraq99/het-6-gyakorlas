package hu.progmatic;

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
        return null;
    }

    /**
     * Havas napok számát visszaadó metódus.
     * Az első 4 hét adatait kell feldolgoznia.
     * Egy nap akkor havas, ha volt csapadék és a hőmérséklet <= 0.
     * @param district a kerület száma (I. = 1)
     * @return havas napok száma
     */
    public static int getSnowyDays(int district) {
        return 0;
    }

    /**
     * Az összes leesett hót visszaadó metódus.
     * Az első 4 hét adatait kell feldolgoznia.
     * @param district a kerület száma (I. = 1)
     * @return összes leesett hó
     */
    public static int getTotalSnow(int district) {
        return 0;
    }
}

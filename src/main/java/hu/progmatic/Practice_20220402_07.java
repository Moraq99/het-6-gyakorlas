package hu.progmatic;

public class Practice_20220402_07 {
    /**
     * Hőmérsékleteket rendezve visszaadó metódus.
     * @param temperatures rendezetlen hőmérsékletek
     * @return hőmérsékletek rendezve
     */
    public static int[] getTemperaturesSorted(int[] temperatures) {
        return null;
    }

    /**
     * Az esős napok számát visszaadó metódus.
     * Csak az első 4 hetet kell figyelembe venni.
     * Azok a napok számítanak esősnek, amikor a hőmérséklet >= 0 és van csapadék.
     * @param district körzet száma (I. = 1)
     * @return esős napok száma
     */
    public static int getRainyDays(int district) {
        return 0;
    }

    /**
     * A teljes városban leesett eső összegét visszaadó metódus.
     * Csak az első 4 hetet kell figyelembe venni.
     * @return
     */
    public static int getRainTotal() {
       return 0;
    }

    /**
     * Az adott kerületben az első legalább 10 fokos változást megkereső metódus.
     * A metódusnak szükség esetén az első 4 hét után is keresnie kell.
     * @param district körzet száma (I. = 1)
     * @param day kezdő nap
     * @return első olyan nap indexe, amikor legalább 10 fokot változott a hőmérséklet az előző naphoz képest
     */
    public static int getFirstBigChangeFrom(int district, int day) {
        return 0;
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
        return 0;
    }

    /**
     * A metódus egy hőmérséklet alapján visszaadja a hozzá tartozó leírást.
     * @param temperature hőmérséklet
     * @return leírás
     */
    public static String getDescriptionFromTemperature(int temperature) {
        return null;
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
        return null;
    }

    /**
     * A metódus igazzala tér vissza, ha 00:00 és 24:00 között növekedett a hőmérséklet.
     * @param district körzet
     * @param day nap
     * @return igaz, ha növekedett a hőmérséklet
     */
    public static boolean isTemperatureIncreasing(int district, int day) {
        return false;
    }
}

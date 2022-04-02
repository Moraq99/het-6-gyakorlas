package hu.progmatic;

public class Practice_20220402_05 {
    /**
     * Az első olyan napot adja vissza, amelyik melegebb volt a megadott hőmérsékletnél.
     * Nem csak az első 4 hetet kell figyelembe vennie.
     * @param district a kerület száma (I. = 1)
     * @param temperature referencia hőmérséklet
     * @return első talált nap indexe
     */
    public static int getFirstDayWarmerThan(int district, int temperature) {
        int day = 0;

        while (Gigapolis.getTemperature(district, day) <= temperature) {
            day++;
        }

        return day;
    }

    /**
     * Az első olyan napot adja vissza, amelyik hidegebb volt a megadott hőmérsékletnél.
     * Nem csak az első 4 hetet kell figyelembe vennie.
     * @param district a kerület száma (I. = 1)
     * @param temperature referencia hőmérséklet
     * @return első talált nap indexe
     */
    public static int getFirstDayColderThan(int district, int temperature) {
        int day = 0;

        while (Gigapolis.getTemperature(district, day) >= temperature) {
            day++;
        }

        return day;
    }

    /**
     * Az első olyan napot visszaadó metódus, amikor a kezdőnaptól fogva összesen leesett csapadék eléri a megadott szintet.
     * Nem csak az első 4 hetet kell figyelembe vennie.
     * @param district a kerület száma (I. = 1)
     * @param dayFrom 2250.01.01. óta eltelt napok száma
     * @param precipitation összes csapadék
     * @return első olyan nap indexe, amikor az összesen leesett csapadék eléri a megadott értéket
     */
    public static int getPrecipitationTotalAtLeast(int district, int dayFrom, int precipitation) {
        int total = 0;
        int day = dayFrom;

        do {
            total += Gigapolis.getPrecipitation(district, day);

            if (total < precipitation) {
                day++;
            }
        } while (total < precipitation);

        return day;
    }
}

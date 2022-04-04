package hu.progmatic;

public class Practice_20220404_03 {
    /**
     * Egy dolgozó maximum maxForce erőt képes kifejteni (optimális szög esetében)
     * A ténylegesen kifejtett erőt a sin(szög) * maxForce képlettel kapjuk meg.
     * A kezdő szög 0 radián.
     * Írjunk metódust, amelyik visszaadja,
     * hogy hányszor kell 0.01 radiánnal megnövelni a szöget,
     * hogy elérjük a szükséges erőt (requiredForce).
     * Ha requiredForce > maxForce, akkor térjünk vissza -1-el.
     *
     * @param maxForce
     * @param requiredForce
     * @return
     */
    public static int getMinimumTurns(int maxForce, int requiredForce) {
        return 0;
    }

    /**
     * Egy titokzatos sugárzás az eltelt idő függvényében az alábbiak szerint gyengül:
     * pow(2, -time) = 2 ^ (-time) = "kettő a -időediken :)"
     * currentLevel = pow(2, -time) * startLevel
     * Mennyi idő alatt lesz biztonságus a helység?
     * @param startLevel
     * @param safeLevel
     * @return
     */
    public static int getSafeTime(int startLevel, int safeLevel) {
        return 0;
    }

    /**
     * Adjuk vissza azoknak a napoknak a számát, amikor a forgalom legalább 100 volt.
     * @param traffic
     * @return
     */
    public static int getBusyDays(int[] traffic) {
        return 0;
    }

    /**
     * Adjuk vissza azoknak a napoknak a számát, amikor a forgalom emelkedett az előző naphoz képest.
     * @param traffic
     * @return
     */
    public static int getIncreases(int[] traffic) {
        return 0;
    }

    /**
     * Adjuk vissza a legnagyobb napi forgalmat.
     * @param traffic
     * @return
     */
    public static int getMaxTraffic(int[] traffic) {
        return 0;
    }

    /**
     * Adjuk vissza a legnagyobb előző naphoz viszonyított emelkedést.
     * Ha nem volt emelkedés, akkor 0-val térjünk vissza.
     * @param traffic
     * @return
     */
    public static int getMaxIncrease(int[] traffic) {
        return 0;
    }

    /**
     * Ha találunk a minTraffic-nál nagyobb forgalmat, akkor térjünk vissza igazzal.
     * @param traffic
     * @param minTraffic
     * @return
     */
    public static boolean findTrafficGreaterThan(int[] traffic, int minTraffic) {
        return false;
    }
}

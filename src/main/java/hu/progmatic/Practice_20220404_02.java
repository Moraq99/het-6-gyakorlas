package hu.progmatic;

public class Practice_20220404_02 {
    /**
     * Van 3 különböző magasságú dobozunk.
     * Lehet-e belőlük egy vízszintes felületet létrehozni az alábbi 2 módszer egyikével:
     * - egymás mellé rakjuk őket
     * - kettőt egymásra rakunk
     * @param a magasság
     * @param b magasság
     * @param c magasság
     * @return lehet-e vízszintes felületet létrehozni?
     */
    public static boolean doBoxesFit(int a, int b, int c) {
        return false;
    }

    /**
     * 10 kg-ig - 100 (s)
     * 20 kg-ig - 200 (m)
     * 100 kg-ig - 300 (l)
     * 100 kg fölött minden megkezdett 100 kg után további 100 (xl)
     * @param weight súly
     * @return postai díj
     */
    public static int getPostageFee(int weight) {
        return 0;
    }

    /**
     * s -> 0 kg
     * m -> 10 kg
     * l -> 20 kg
     * xl -> 100 kg
     * érvénytelen érték -> -1
     * @param category
     * @return
     */
    public static int getLowerBound(String category) {
        return 0;
    }

    /**
     * "    EXABC123    " -> true
     * "  ABC4443EX   " -> true
     * " TREX123AA"     -> false
     * Az első 2 karakter (szóközöket nem számolva) EX
     * vagy az utolsó 2 karakter (szóközöket nem számolva) EX.
     * @param id csomag azonosítója
     * @return expressz küldeményről van-e szó
     */
    public static boolean isExpress(String id) {
        return false;
    }

    /**
     * HONNAN;HOVA
     * "GIGAPOLIS;MEGAPOLIS" -> true
     * "MEGAPOLIS;GIGAPOLIS" -> false
     * "GIGAPOLIS;TERAPOLIS" -> true
     * "TERAPOLIS;GIGAPOLIS" -> false
     * "MEGAPOLIS;TERAPOLIS" -> false
     * @param routeData
     * @return
     */
    public static boolean isOutgoing(String routeData) {
        return false;
    }

    /**
     * Egy csomag akkor van átutazóban, ha nem GIGAPOLIS-ban adták fel és nem is az a célja.
     * "TERAPOLIS;GIGAPOLIS" -> false
     * "MEGAPOLIS;TERAPOLIS" -> true
     * @param routeData
     * @return
     */
    public static boolean isTransit(String routeData) {
        return false;
    }

    /**
     * Egy tömb az utolsó valahány nap postai forgalmát tartalmazza.
     * Készítsünk metódust, amelyik visszaadja az utolsó 3 nap átlagát.
     * @param traffic
     * @return
     */
    public static int getAverageLast3Days(int[] traffic) {
        return 0;
    }
}

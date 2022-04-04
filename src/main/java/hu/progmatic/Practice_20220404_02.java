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
        if (a == b && b == c) {
            return true;
        } else if (a + b == c || a + c == b || b + c == a) {
            return true;
        } else {
            return false;
        }
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
        if (weight <= 10) {
            return 100;
        } else if (weight <= 20) {
            return 200;
        } else if (weight <= 100) {
            return 300;
        } else {
            return 300 + ((weight - 101) / 100 + 1) * 100;
            // return 300 + (int) Math.ceil((weight - 100) / 100.0) * 100;
        }
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
        switch (category) {
            case "s":
                return 0;
            case "m":
                return 10;
            case "l":
                return 20;
            case "xl":
                return 100;
            default:
                return -1;
        }
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
        id = id.trim();
        return id.startsWith("EX") || id.endsWith("EX");
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
        String[] fields = routeData.split(";");
        return fields[0].equals("GIGAPOLIS");
    }

    /**
     * Egy csomag akkor van átutazóban, ha nem GIGAPOLIS-ban adták fel és nem is az a célja.
     * "TERAPOLIS;GIGAPOLIS" -> false
     * "MEGAPOLIS;TERAPOLIS" -> true
     * @param routeData
     * @return
     */
    public static boolean isTransit(String routeData) {
        String[] fields = routeData.split(";");
        return !fields[0].equals("GIGAPOLIS") && !fields[1].equals("GIGAPOLIS");
        // HA nincsen GIGAPOLIS2 nevű város
        // return routeData.contains("GIGAPOLIS");
    }

    /**
     * Egy tömb az utolsó valahány nap postai forgalmát tartalmazza.
     * Készítsünk metódust, amelyik visszaadja az utolsó 3 nap átlagát.
     * @param traffic
     * @return
     */
    public static int getAverageLast3Days(int[] traffic) {
        return (traffic[traffic.length - 3] + traffic[traffic.length - 2] + traffic[traffic.length - 1]) / 3;
    }
}

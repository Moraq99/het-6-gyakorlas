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
        if (maxForce < requiredForce) {
            return -1;
        }

        double angle = 0.0;
        int turns = 0;

        while (Math.sin(angle) * maxForce < requiredForce) {
            angle += 0.01;
            turns++;
        }

        return turns;
    }

    /**
     * Egy titokzatos sugárzás az eltelt idő függvényében az alábbiak szerint gyengül:
     * pow(2, -time) = 2 ^ (-time) = "kettő a -időediken :)"
     * currentLevel = pow(2, -time) * startLevel
     * Mennyi idő alatt lesz biztonságos a helység?
     * @param startLevel
     * @param safeLevel
     * @return
     */
    public static int getSafeTime(int startLevel, int safeLevel) {
        int time = 0;

        while (Math.pow(2, -time) * startLevel > safeLevel) {
            time++;
        }

        return time;
    }

    /**
     * Adjuk vissza azoknak a napoknak a számát, amikor a forgalom legalább 100 volt.
     * @param traffic
     * @return
     */
    public static int getBusyDays(int[] traffic) {
        int busyDays = 0;

        for (int t : traffic) {
            if (t >= 100) {
                busyDays++;
            }
        }

        return busyDays;
    }

    /**
     * Adjuk vissza azoknak a napoknak a számát, amikor a forgalom emelkedett az előző naphoz képest.
     * @param traffic
     * @return
     */
    public static int getIncreases(int[] traffic) {
        int increases = 0;

        for (int i = 0; i < traffic.length - 1; i++) {
            if (traffic[i] < traffic[i + 1]) {
                increases++;
            }
        }

        return increases;
    }

    /**
     * Adjuk vissza a legnagyobb napi forgalmat.
     * @param traffic
     * @return
     */
    public static int getMaxTraffic(int[] traffic) {
        int max = Integer.MIN_VALUE;

        for (int t : traffic) {
            if (t > max) {
                max = t;
            }
        }

        return max;
    }

    /**
     * Adjuk vissza a legnagyobb előző naphoz viszonyított emelkedést.
     * Ha nem volt emelkedés, akkor 0-val térjünk vissza.
     * @param traffic
     * @return
     */
    public static int getMaxIncrease(int[] traffic) {
        int max = 0;

        for (int i = 0; i < traffic.length - 1; i++) {
            int change = traffic[i + 1] - traffic[i];

            if (change > max) {
                max = change;
            }
        }

        return max;
    }

    /**
     * Ha találunk a minTraffic-nál nagyobb forgalmat, akkor térjünk vissza igazzal.
     * @param traffic
     * @param minTraffic
     * @return
     */
    public static boolean findTrafficGreaterThan(int[] traffic, int minTraffic) {
        for (int t : traffic) {
            if (t > minTraffic) {
                return true;
            }
        }

        return false;
    }

    /**
     * Készítsünk metódust, amelyik megszámolja azokat az azonosítókat,
     * amik tartalmazzák a "GIGAPOLIS" szöveget.
     * @param mailIds
     * @return
     */
    public static int getGigapolisMailNumber(String[] mailIds) {
        int mailNumber = 0;

        for (String mailId : mailIds) {
            if (mailId.contains("GIGAPOLIS")) {
                mailNumber++;
            }
        }

        return mailNumber;
    }

    /**
     * Készítsünk metódust, amelyik növekvő sorrendben rendezi a napi forgalmakat.
     * A metódus NEM helyben rendez (az eredeti tömböt nem változtathatja meg).
     * @param traffic
     * @return
     */
    public static int[] sortTraffic(int[] traffic) {
        int[] clone = traffic.clone();

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
}

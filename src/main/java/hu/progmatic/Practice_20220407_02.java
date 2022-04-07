package hu.progmatic;

public class Practice_20220407_02 {
    public static void sortTemperature(double[] temperatures) {
        for (int i = 0; i < temperatures.length - 1; i++) {
            boolean ready = bubble(temperatures, i);

            if (ready) {
                break;
            }
        }
    }

    public static boolean bubble(double[] temperatures, int sorted) {
        boolean ready = true;

        for (int i = 0; i < temperatures.length - sorted - 1; i++) {
            if (temperatures[i] > temperatures[i + 1]) {
                double swap = temperatures[i];
                temperatures[i] = temperatures[i + 1];
                temperatures[i + 1] = swap;
                ready = false;
            }
        }

        return ready;
    }
}

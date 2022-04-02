package hu.progmatic;

public final class Gigapolis {
    private Gigapolis() {

    }

    /**
     * Dates from 2250.01.01. to 2250.01.28.
     * @return dates
     */
    public static String[] getDates() {
        String[] dates = new String[28];

        for (int i = 0; i < 28; i++) {
            dates[i] = String.format("2250.01.%02d.", i + 1);
        }

        return dates;
    }

    /**
     * Temperature data by district (I., II., III.) from 2250.01.01 to 2250.01.28.
     * @return temperatures
     */
    public static int[][] getTemperature() {
        return new int[][] {
                {
                        11,	18,	7, -7,	22,	15,	19,
                        30,	15,	-10, 13, -3, 20, 30,
                        26,	5,	26,	-5,	23,	8,	9,
                        19,	10,	25,	4,	6,	12,	26
                },
                {
                        10,	14,	-9,	29,	3,	-8,	24,
                        -10, 18, 24, -4, 29, -7, 24,
                        9,	-8,	-7,	16,	6,	0,	25,
                        23,	-4,	9,	19,	-4,	-8,	26
                },
                {
                        -1,	6,	21,	29,	20,	0,	16,
                        8,	3,	1,	6,	-2,	26,	20,
                        -5,	-1,	21,	24,	19,	-7,	25,
                        -10, 12, 9,	-4,	0,	-7,	22
                }
        };
    }

    /**
     * Precipitation data by district (I., II., III.) from 2250.01.01 to 2250.01.28.
     * @return precipitation data
     */
    public static int[][] getPrecipitation() {
        return new int[][] {
                {
                        0,	0,	96,	0,	15,	0,	30,
                        82,	0,	0,	89,	0,	0,	0,
                        49,	12,	0,	0,	45,	54,	0,
                        59,	56,	35,	15,	0,	0,	0
                },
                {
                        10,	0,	4,	65,	0,	0,	0,
                        0,	0,	57,	53,	0,	64,	0,
                        49,	0,	14,	11,	71,	98,	71,
                        100,	33,	90,	67,	25,	0,	0
                },
                {
                        0,	37,	0,	50,	0,	40,	0,
                        0,	60,	5,	14,	98,	0,	62,
                        90,	0,	0,	0,	82,	83,	89,
                        0,	41,	78,	0,	58,	62,	0
                }
        };
    }

    /**
     * Temperature on a given day at 00:00.
     * @param district Number of district (I. is 1).
     * @param day Days elapsed since 2250.01.01. (2250.01.01 is 0)
     * @return temperature
     */
    public static int getTemperature(int district, int day) {
        int periods = day / 28;
        int temperature = getTemperature()[district - 1][day % 28];
        temperature += ((periods + 1) % 3) * 20 - 20;

        return temperature;
    }

    /**
     * Precipitation on a given day.
     * @param district Number of district (I. is 1).
     * @param day Days elapsed since 2250.01.01. (2250.01.01 is 0)
     * @return precipitation
     */
    public static int getPrecipitation(int district, int day) {
        int periods = day / 28;
        int precipitation = getPrecipitation()[district - 1][day % 28];
        precipitation += (periods % 3) * 25;

        return precipitation;
    }

    /**
     * Forecast data for the whole city in the following format:
     * ID;DATE;TEMPERATURE;PRECIPITATION
     * @return forecast data
     */
    public static String[] getForecasts() {
        String[] dates = getDates();
        int[][] temperatureData = getTemperature();
        int[][] precipitationData = getPrecipitation();

        String[] forecasts = new String[dates.length * 2];

        for (int i = 0; i < dates.length; i++) {
            String suffix = dates[i].substring(5, 7)
                    + dates[i].substring(8);

            int temperature = (temperatureData[0][i] + temperatureData[1][i]) / 2;
            int precipitation = (precipitationData[0][i] + precipitationData[1][i]) / 2;
            String forecast = "ALFA"
                    + suffix
                    + ";"
                    + dates[i]
                    + ";"
                    + temperature
                    + ";"
                    + precipitation;

            forecasts[i * 2] = forecast;

            temperature = (temperatureData[1][i] + temperatureData[2][i]) / 2;
            precipitation = (precipitationData[1][i] + precipitationData[2][i]) / 2;
            forecast = "BETA"
                    + suffix
                    + ";"
                    + dates[i]
                    + ";"
                    + temperature
                    + ";"
                    + precipitation;

            forecasts[i * 2 + 1] = forecast;
        }

        return forecasts;
    }

    public static int[][] getTeleportationCosts() {
        return new int[][] {
                { 0, 79, 99,	77,	30,	67 },
                { 79, 0, 40,	9,	31,	63 },
                { 99,	40,	0,	57,	59,	64 },
                { 77,	9,	57,	0,	31,	66 },
                { 30,	31,	59,	31,	0,	79 },
                { 67,	63,	64,	66,	79,	0 }
        };
    }
}

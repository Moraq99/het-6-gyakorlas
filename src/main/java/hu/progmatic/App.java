package hu.progmatic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String dates[] = Gigapolis.getDates();
        int temperature = Practice_20220402_01.getTemperatureDistrictI(2);
        System.out.println( "3. napon érvényes hőmérséklet: " + temperature);

        String forecasts[] = Gigapolis.getForecasts();
        System.out.println("Hello World! :)");

        System.out.println("ALFA0001".startsWith("ALFA"));
        System.out.println("XYZALFA001".contains("ALFA"));
    }
}

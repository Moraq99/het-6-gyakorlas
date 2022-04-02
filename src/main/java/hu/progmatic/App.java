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
    }
}

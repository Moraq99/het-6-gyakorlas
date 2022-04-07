package hu.progmatic;

public class Practice_20220407_10 {
    public static void main(String[] args) {
        boolean van36OrasMunkahely = false;
        boolean diakE = true;
        boolean szeretiAzAllamot = true;
        boolean mellekallasuVallalkozo = van36OrasMunkahely || diakE;

        // van36OrasMunkahely || diakE
        if (mellekallasuVallalkozo) {
            System.out.println("25");
        } else if (szeretiAzAllamot) {
            System.out.println("75");
        } else {
            System.out.println("50");
        }
    }
}

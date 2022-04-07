package hu.progmatic;

public class Practice_20220407_05 {
    public static void main(String[] args) {
        String csvLine = "2022.04.07;Progmatic;17:00;20:00;21";
        String[] csvCells = csvLine.split(";");
        String csvLine2 = csvCells[1]
                + ";"
                + csvCells[0]
                + ";"
                + csvCells[2]
                + ";"
                + csvCells[3]
                + ";"
                + csvCells[4];
        int participants = Integer.parseInt(csvCells[4]);
        System.out.println("Hiányzók száma: " + (25 - participants));
        System.out.println(csvLine2);
    }
}

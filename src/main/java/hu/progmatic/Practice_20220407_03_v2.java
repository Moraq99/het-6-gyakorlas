package hu.progmatic;

import java.util.Scanner;

public class Practice_20220407_03_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első raktár méretét!");
        String size1 = scanner.nextLine();
        System.out.println("Kérem a második raktár méretét!");
        String size2 = scanner.nextLine();

        int capacity = 0;
        capacity += getCapacity(size1);
        capacity += getCapacity(size2);
        System.out.println("Az összes kapacitás: " + capacity);
    }

    public static int getCapacity(String size) {
        switch (size) {
            case "s":
                return 10;
            case "m":
                return 20;
            case "l":
                return 40;
            default:
                return 0;
        }
    }
}

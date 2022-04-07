package hu.progmatic;

import java.util.Scanner;

public class Practice_20220407_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első raktár méretét!");
        String size1 = scanner.nextLine();
        System.out.println("Kérem a második raktár méretét!");
        String size2 = scanner.nextLine();

        int capacity = 0;

        switch (size1) {
            case "s":
                capacity += 10;
                break;
            case "m":
                capacity += 20;
                break;
            case "l":
                capacity += 40;
                break;
            default:
                capacity += 0;
                break;
        }

        switch (size2) {
            case "s":
                capacity += 10;
                break;
            case "m":
                capacity += 20;
                break;
            case "l":
                capacity += 40;
                break;
            default:
                capacity += 0;
                break;
        }

        System.out.println("Az összes kapacitás: " + capacity);
    }
}

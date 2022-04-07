package hu.progmatic;

import java.nio.charset.StandardCharsets;

public class Practice_20220407_08 {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }

        System.out.println(sum);

        number = 12345;
        sum = 0;
        String numberAsString = number + "";

        for (int i = 0; i < numberAsString.length(); i++) {
            String sub = numberAsString.substring(i, i + 1);
            int num = Integer.parseInt(sub);
            sum += num;
        }

        System.out.println(sum);
    }
}

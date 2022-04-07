package hu.progmatic;

public class Practice_20220407_04 {
    public static void main(String[] args) {
        System.out.println(isArrayMirror(new int[] {9}));
        System.out.println(isArrayMirror(new int[] {1, 1}));
        System.out.println(isArrayMirror(new int[] {1, 2, 1}));
        System.out.println(isArrayMirror(new int[] {1, 2, 2, 1}));
        System.out.println(isArrayMirror(new int[] {1, 1, 2}));
        System.out.println(isArrayMirror(new int[] {1, 2, 3}));

        int[] numbers = {1, 2, 3, 4};

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        int billnr = 2;
        System.out.println("MB/2022/" + billnr);
        System.out.println("MB/2022/%06d");
        System.out.printf("MB/2022/%06d\n", billnr);

        billnr = 1155;
        System.out.println("MB/2022/" + billnr);
        System.out.printf("MB/2022/%06d\n", billnr);
        double temperature = 2.0 / 3.0;
        System.out.println(temperature);
        System.out.printf("%.2f\n", temperature);
    }

    public static boolean isArrayMirror(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[(numbers.length - 1) - i]) {
                return false;
            }
        }

        return true;
    }
}

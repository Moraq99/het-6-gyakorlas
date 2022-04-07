package hu.progmatic;

public class Practice_20220407_09 {
    public static void main(String[] args) {
        System.out.println(getArraySum(new int[] {1, 2, 3, 4, 5, 1000}));
    }

    public static int getArraySum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}

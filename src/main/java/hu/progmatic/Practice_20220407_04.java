package hu.progmatic;

public class Practice_20220407_04 {
    public static void main(String[] args) {
        System.out.println(isArrayMirror(new int[] {9}));
        System.out.println(isArrayMirror(new int[] {1, 1}));
        System.out.println(isArrayMirror(new int[] {1, 2, 1}));
        System.out.println(isArrayMirror(new int[] {1, 2, 2, 1}));
        System.out.println(isArrayMirror(new int[] {1, 1, 2}));
        System.out.println(isArrayMirror(new int[] {1, 2, 3}));
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

package hu.progmatic;

public class Practice_20220407_01 {
    /**
     * "applepie", "applecider", "candyapple"... OK
     * "cherry", "sugar"... NOT OK
     * @param foods
     * @return
     */
    public static boolean doWeHaveAppleFood(String[] foods) {
        for (String food : foods) {
            if (food.contains("apple")) {
                return true;
            }
        }

        return false;
    }

    /**
     * A legolcsóbb olyan étel árát adja vissza, amelyik NEM olcsóbb (>=)
     * a megadott minimális árnál.
     * @param foodPrices
     * @param minPrice
     * @return
     */
    public static int cheapestFoodMoreExpensiveThan(int[] foodPrices, int minPrice) {
        int min = Integer.MAX_VALUE;

        for (int foodPrice : foodPrices) {
            if (foodPrice >= minPrice && foodPrice < min) {
                min = foodPrice;
            }
        }

        return min;
    }
}

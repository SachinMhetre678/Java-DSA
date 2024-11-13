
public class Knapsack01 {

    // Function to solve the 0/1 Knapsack problem
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length; // Number of items

        // Create a DP table where dp[i][w] represents the maximum value
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                // If the weight of the current item is more than the current capacity
                // we skip this item
                if (weights[i - 1] > w) {
                    dp[i][w] = dp[i - 1][w];
                } else {
                    // Otherwise, we choose the maximum of including or excluding the item
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        // The value at dp[n][capacity] will be the maximum value we can achieve
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        int maxValue = knapsack(weights, values, capacity);
        System.out.println("The maximum value in the knapsack is: " + maxValue);
    }
}


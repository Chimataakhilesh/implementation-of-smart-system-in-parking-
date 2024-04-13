import java.util.Scanner;
public class MaximumIncreasingSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
        array[i] = scanner.nextInt();
        }
        int maxSum = findMaxIncreasingSubarraySum(array, n);
        System.out.println(maxSum);
    }
    private static int findMaxIncreasingSubarraySum(int[] array, int n) {
        int[] dp = new int[n];
        dp[0] = array[0];
        int maxSum = dp[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                dp[i] = dp[i - 1] + array[i];
            } else {
                dp[i] = array[i];
            }
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;
    }
}
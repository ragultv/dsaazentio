
class MinimumPairRemovalToSortArrayI {
    public int minimumRemovals(int[] nums) {
        int n = nums.length, res = 0, max = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] <= nums[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        return n - max;
    }
}

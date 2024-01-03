class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return Math.max(money(nums, dp, 0), money(nums, dp, 1));
    }

    public int money(int[] nums, int[] dp, int i) {
        if(i >= nums.length)
            return 0;
        if(dp[i] == -1)
            dp[i] = Math.max(nums[i] + money(nums, dp, i+2), money(nums, dp, i+1));
        return dp[i];
    }
}
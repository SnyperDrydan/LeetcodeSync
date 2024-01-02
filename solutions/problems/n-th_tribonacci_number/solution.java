class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[38];
        return getTribo(n, dp);
    }

    public int getTribo(int n, int[] dp) {
        if(n == 0)
            return 0;
        if(n <= 2)
            return 1;
        if(dp[n] == 0)
            dp[n] = getTribo(n-1, dp) + getTribo(n-2, dp) + getTribo(n-3, dp);
        return dp[n];
    }
}
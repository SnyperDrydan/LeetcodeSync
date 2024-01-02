class Solution {
    public int fib(int n) {
        int[] dp = new int[31];
        return calcFib(n, dp);
    }

    public int calcFib(int n, int[] dp) {
        if(n <= 1)
            return n;
        if(dp[n] == 0)
            dp[n] = calcFib(n-1, dp) + calcFib(n-2, dp);

        return dp[n];
    }
}
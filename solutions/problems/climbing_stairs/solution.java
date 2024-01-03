class Solution {
    public int climbStairs(int n) {
        int prev2 = 1;
        int prev1 = 1;
        for(int i = 2; i < n+1; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }

        return prev2;
    }
}
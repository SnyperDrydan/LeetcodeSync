class Solution {
    public int fib(int n) {
        int prev = 1;
        int prev2 = 0;
        if(n <= 1) return n;
        int fib = prev + prev2;
        for(int i = 2; i <= n; i++) {
            fib = prev+prev2;
            prev2 = prev;
            prev = fib;
        }

        return fib;
    }
}
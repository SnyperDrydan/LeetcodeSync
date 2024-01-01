class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        return traverse(n , arr);
    }

    public int traverse(int n, int[] arr) {
        if(n <= 1)
            return 1;
        if(arr[n] != 0) {
            return arr[n];
        }
        else {
            arr[n] = traverse(n-1, arr) + traverse(n-2, arr);
            return arr[n];
        }
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, sum = 0;
        int min = Integer.MAX_VALUE;
        while(r < nums.length) {
            sum += nums[r++];
            while(sum >= target) {
                min = Math.min(min, r-l);
                sum -= nums[l++];
            } 
        }

        return min == Integer.MAX_VALUE ? 0: min;
    }
}
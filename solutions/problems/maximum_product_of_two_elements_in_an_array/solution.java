class Solution {
    public int maxProduct(int[] nums) {
        int first = nums[0], second = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > first) {
                second = first;
                first = nums[i];
            } else {
                second = Math.max(second, nums[i]);
            }
        }

        return (first-1)*(second-1);
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(i != start) {
                    int temp = nums[start];
                    nums[start] = nums[i];
                    nums[i] = temp;
                }
                start++;
            }
        }
    }
}
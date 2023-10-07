class Solution {
    public boolean check(int[] nums) {

        int faults = 0;

        for(int i = 1; i <= nums.length-1; i++) {
            if(nums[i-1] > nums[i]) faults++;
        }

        if(nums[nums.length-1] > nums[0]) faults++;
        
        return faults < 2;
    }
}
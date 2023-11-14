class Solution {
    public int majorityElement(int[] nums) {
        int a = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0 ) {
                a = nums[i];
            }
            
            if(nums[i] == a)
                count++;
            else {
                count--;
            }
            
        }

        return a;
    }
}
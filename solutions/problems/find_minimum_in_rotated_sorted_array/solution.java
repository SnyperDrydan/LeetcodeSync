class Solution {
    public int findMin(int[] nums) {

        int l = 0, h = nums.length-1;
        int min = Integer.MAX_VALUE;
        int m = (l+h)/2;
        while(l<=h) {
            m = (l+h)/2;
            if(nums[l] <= nums[m]) {
                min = Math.min(nums[l], min);
                l = m+1;
            } else {
                min = Math.min(nums[m], min);
                h = m-1;
            }

        }
        
        return min;
    }
}
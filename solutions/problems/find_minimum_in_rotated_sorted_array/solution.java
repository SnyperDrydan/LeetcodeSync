class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1, min = nums[h];

        while(l<=h) {
            int m = (l+h)/2;

            if(nums[l]<=nums[m]) {
                min = Math.min(min, nums[l]);
                l = m+1;
            } else {
                min = Math.min(min, nums[m]);
                h = m-1;
            }
        }

        return min;
    }
}
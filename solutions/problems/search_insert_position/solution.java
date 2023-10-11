class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, h = nums.length-1, pos = nums.length;
        while(l<=h) {
            int m = (h + l)/2;
            if(nums[m] >= target) {
                h = m-1;
                pos = m;
            } else {
                l = m+1;
            }
        }

        return pos;
    }
}
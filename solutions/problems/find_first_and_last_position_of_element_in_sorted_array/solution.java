class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, 1};

        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    private int findFirst(int[] nums, int x) {
        int l = 0, h = nums.length-1;
        int ans = -1;
        while(l <= h) {
            int m = (l + h)/2;
            if(nums[m] >= x) {
                if(nums[m] == x)
                    ans = m;
                h = m-1;
            }
            else {
                l = m+1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int x) {
        int l = 0, h = nums.length-1;
        int ans = -1;
        while(l <= h) {
            int m = (l + h)/2;
            if(nums[m] <= x) {
                if(nums[m] == x)
                    ans = m;
                l = m+1;
            }
            else {
                h = m-1;
            }
        }

        return ans;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length-1;

        while(m <= h) {
            if(nums[m] == 0) {
                replace(nums, l, m);
                l++;
                m++;
            } else if(nums[m] == 1) {
                m++;
            }
            else {
                replace(nums, m, h);
                h--;
            }
        }
    }

    public void replace(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
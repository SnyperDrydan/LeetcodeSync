class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, last = nums[0], count = 0;
        while(j < nums.length) {
            if(j > 0 && last == nums[j]) {
                if(count > 1) {
                    j++;
                } else {
                    nums[i] = nums[j];
                    last = nums[j];
                    i++;
                    j++;
                    count++;
                }

            } else {
                nums[i] = nums[j];
                last = nums[j];
                i++;
                j++;
                count=1;
            }
        }

        return i;
    }
}
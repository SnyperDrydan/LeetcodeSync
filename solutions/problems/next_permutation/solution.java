class Solution {
    public void nextPermutation(int[] nums) {

        int index = -1;
        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            reverse(nums, 0, nums.length-1);
            return;
        }

        for(int j = nums.length - 1; j > index; j--) {
            if(nums[j] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
                break;
            }
        }

        

        reverse(nums, index+1, nums.length-1);
        
    }

    public void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, 1);

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1]*nums[i-1];
        }

        int sufProd = 1;

        for (int i = len-1; i >= 0; i--) {
            res[i] = res[i]*sufProd;
            sufProd = sufProd*nums[i];
        }
        

        return res;
    }
}
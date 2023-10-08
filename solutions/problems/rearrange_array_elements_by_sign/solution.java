class Solution {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for(int num: nums) {
            if(num < 0)
                negative.add(num);
            else
                positive.add(num);
        }

        boolean toggle = true;
        int i = 0, j = 0, k = 0;
        while(i < positive.size() && j < negative.size()) {
            if(toggle == true)
                nums[k++] = positive.get(i++);
            else
                nums[k++] = negative.get(j++);
            toggle = !toggle;
        }

        while(j < negative.size())
            nums[k++] = negative.get(j++);

        while(i < positive.size())
            nums[k++] = positive.get(i++);
        

        return nums;
    }
}
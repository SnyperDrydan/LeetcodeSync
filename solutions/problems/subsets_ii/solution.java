class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, set, nums, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> set, int[] nums, int start) {
        res.add(new ArrayList<>(set));
        
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue;
            set.add(nums[i]);
            dfs(res, set, nums, i+1);
            set.remove(set.size() - 1);
        }
    }
}
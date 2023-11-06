class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(res, set, nums, 0);
        return res; 
    }

    public void dfs(List<List<Integer>> res, List<Integer> set, int[] nums, int start) {
        if(start >= nums.length) {
            res.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[start]);
        dfs(res, set, nums, start+1);
        set.remove(set.size() - 1);
        dfs(res, set, nums, start+1);
    }
}
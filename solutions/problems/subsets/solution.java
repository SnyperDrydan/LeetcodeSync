class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(res, set, nums, 0);

        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> set, int[] nums, int cur) {
        if(cur >= nums.length) {
            res.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[cur]);
        dfs(res, set, nums, cur+1);
        set.remove(set.size() - 1);
        dfs(res, set, nums, cur+1);
    }
}
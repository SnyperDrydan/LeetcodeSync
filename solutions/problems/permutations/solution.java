class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(res, set, nums);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> set, int[] nums) {
        if(set.size() == nums.length) {
            res.add(new ArrayList<>(set));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) continue;
            set.add(nums[i]);
            dfs(res, set, nums);
            set.remove(set.size() - 1);
        }
    }
}
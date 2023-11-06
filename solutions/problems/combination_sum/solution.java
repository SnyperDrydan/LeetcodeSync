class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res, set, candidates, target, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> set, int[] nums, int remaining, int start) {
        if(remaining < 0) {
            return;
        }

        if(start >= nums.length) {
            return;
        }

        if(remaining == 0) {
            res.add(new ArrayList<>(set));
            return;
        }

        set.add(nums[start]);
        dfs(res, set, nums, remaining - nums[start], start);
        set.remove(set.size() - 1);
        dfs(res, set, nums, remaining, start+1);
    }
}
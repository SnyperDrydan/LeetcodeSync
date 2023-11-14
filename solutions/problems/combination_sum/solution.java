class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(res, set, candidates, target, 0);

        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> set, int[] candidates, int target, int val) {
        if(target == 0)
        {
            res.add(new ArrayList<>(set));
            return;
        } else if(target < 0 || val >= candidates.length)
            return;
        
        set.add(candidates[val]);
        dfs(res, set, candidates, target - candidates[val], val);
        set.remove(set.size() - 1);
        dfs(res, set, candidates, target, val+1);

    }
}
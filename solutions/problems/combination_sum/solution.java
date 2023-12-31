class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        traverse(candidates, target, 0, res, list);
        return res;
    }

    public void traverse(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> list) {
        if(target < 0)
            return;
        else if(target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            traverse(candidates, target - candidates[i], i, res, list);
            list.remove(list.size()-1);
        }   
    }
}
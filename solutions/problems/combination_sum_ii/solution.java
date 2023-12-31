class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        traverse(candidates, target, res, list, 0);

        return res;
    }

    public void traverse(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int start) {
        if(target < 0) return;
        else if(target == 0) {
            res.add(new ArrayList<>(list));
            return;
        } 

        for(int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i-1]) continue;
            list.add(candidates[i]);
            traverse(candidates, target-candidates[i], res, list, i+1);
            list.remove(list.size()-1);
        }
    }
}
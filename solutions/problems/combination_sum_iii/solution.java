class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        traverse(res, list, k, n, 1);

        return res;
    }

    public void traverse(List<List<Integer>> res, List<Integer> list, int k, int n, int start) {
        if(n == 0 && list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = start; i <= 9; i++) {
            list.add(i);
            traverse(res, list, k, n-i, i+1);
            list.remove(list.size()-1);
        }
    }
}
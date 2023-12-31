class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];

        traverse(nums, res, list, visited);

        return res;
    }

    public void traverse(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] visited) {
        if(list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                traverse(nums, res, list, visited);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }

    }
}
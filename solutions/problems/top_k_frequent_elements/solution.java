class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[k];

        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return map.get(b) - map.get(a);
            }
        });

        for(int i : map.keySet()) {
            queue.add(i);
        }

        for(int i = 0; i <k; i++) {
            ans[i] = queue.poll();
        }

        return ans;
    }
}
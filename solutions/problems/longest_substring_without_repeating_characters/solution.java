class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Integer> set = new HashSet<>();

        while(j < s.length()) {
            if(!set.contains(s.charAt(j) - 'a')) {
                set.add(s.charAt(j) - 'a');
                max = Math.max(max, set.size());
                j++;
            } else {
                set.remove(s.charAt(i) - 'a');
                i++;
            }
        }

        return max;
    }
}
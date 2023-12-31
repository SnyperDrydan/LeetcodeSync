class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        int i = 0;
        while(i < s.length()) {
            if(map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
            i++;
        }

        return true;
    }
}
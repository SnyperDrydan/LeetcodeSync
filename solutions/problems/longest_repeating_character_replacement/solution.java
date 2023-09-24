class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int l = 0, max = 0, maxCount = 0, curr = 0, len = 0;

        for(int r = 0; r < s.length(); r++) {
            curr = ++arr[s.charAt(r) - 'A'];
            maxCount = Math.max(maxCount, curr);

            while(r - l + 1 - maxCount > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            max = Math.max(max, r - l + 1);
        }   
        return max;
    }
}
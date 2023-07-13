public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxLength = 0;
        int maxCount = 0;
        int start = 0;
        int end = 0;

        for (; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(end) - 'A']);

            if ((end - start + 1) - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

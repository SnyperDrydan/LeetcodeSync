class Solution {
    public int minExtraChar(String s, String[] dictionary) {

        int[] dp = new int[s.length() + 1];

        for (int i = 1; i <= s.length(); i++) {
            dp[i] = dp[i - 1] + 1;

            for (String word : dictionary) {
                int len = word.length();
                if (i >= len && s.substring(i - len, i).equals(word)) {
                    dp[i] = Math.min(dp[i], dp[i - len]);
                }
            }
        }

        return dp[s.length()];
    }
}
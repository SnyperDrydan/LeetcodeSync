class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = s.toCharArray();

        for(int i = 0, j = chars.length - 1; j >= i; i++, j--) {
            if(chars[i] != chars[j])
                return false;
        }

        return true;
    }
}
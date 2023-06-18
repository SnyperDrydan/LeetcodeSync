class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]+", "");
        s = s.toLowerCase();

        if(s == null || s.isEmpty()) {
            return true;
        }
 

        for(int i = 0, j = s.length()-1; i < s.length()/2 ; i++, j--) {
            if(s.charAt(i) == s.charAt(j)) {
                continue;
            }
            else {
                return false;
            }
        }

        return true;
        
    }
}
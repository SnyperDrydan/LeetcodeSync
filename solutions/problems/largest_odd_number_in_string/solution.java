class Solution {
    public String largestOddNumber(String num) {
        int max = 0;
        for(int i = num.length()-1; i >= 0; i--) {
            char ch = num.charAt(i);
            if(ch%2 == 0) {
                continue;
            }

            return num.substring(0, i+1);
        }

        return "";
    }
}
class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";

        for(int i = 2; i < num.length(); i++) {
            if(num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)) {
                String str = num.substring(i-2, i+1);
                if(str.compareTo(ans) > 0) {
                    ans = str;
                }
            }
        }

        return ans;
    }
}
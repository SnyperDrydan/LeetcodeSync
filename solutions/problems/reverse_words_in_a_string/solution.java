class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();

        StringBuilder str = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);

            if(ch == ' ' && str.length() > 0) {
                res.append(str);
                res.append(' ');
                str = new StringBuilder();
            } else {
                if(ch != ' ')
                    str.insert(0, ch);
            }
        }
        res.append(str);
        return res.toString().trim();
    }
}
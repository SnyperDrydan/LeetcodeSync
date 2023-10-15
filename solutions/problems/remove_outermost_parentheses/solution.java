class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            if(count > 1 && ch == ')') {
                res.append(ch);
            }
            
            count = ch == '(' ? count + 1 : count - 1;
            
            if(count > 1 && ch == '(') {
                res.append(ch);
            }
        }

        return res.toString();
        
    }
}
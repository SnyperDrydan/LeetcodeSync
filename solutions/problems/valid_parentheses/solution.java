class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.size() == 0)
                    return false;
                if(ch == ')' && stack.pop() != '(')
                    return false;
                else if(ch == '}' && stack.pop() != '{')
                    return false;
                else if(ch == ']' && stack.pop() != '[')
                    return false;
            }
        }

        return stack.size() > 0 ? false : true;
    }
}
class Solution {
    public boolean isValid(String s) {

        if(s == null || s.isEmpty())
            return true;

        Stack<Character> stack = new Stack<>();

        List<Character> opening = Arrays.asList('(', '{', '[');
        List<Character> closing = Arrays.asList(')', '}', ']');
        
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(opening.contains(c)) {
                stack.push(c);
                System.out.println(stack);
            }
            else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        } 
        if(stack.size() > 0)
        return false;
        return true;
    }
}
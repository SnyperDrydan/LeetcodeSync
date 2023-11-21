class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens) {
            int val = 0;
            switch(token) {
                case "+": val = stack.pop() + stack.pop();
                            break;
                case "-": val = - stack.pop() + stack.pop();
                            break;
                case "*": val = stack.pop() * stack.pop();
                            break;
                case "/": val =(int) (((double) 1/stack.pop()) * stack.pop());
                            break;
                default: val = Integer.parseInt(token);
                            break;
            }
            stack.push(val);
        }

        return stack.pop();
    }
}
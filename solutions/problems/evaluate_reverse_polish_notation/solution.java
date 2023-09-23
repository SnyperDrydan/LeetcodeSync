class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        
        for(String s: tokens) {
            switch(s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int e1 = stack.pop(), e2 = stack.pop();
                    stack.push(e2/e1);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}
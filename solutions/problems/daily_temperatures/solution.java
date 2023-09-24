class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int curr = 0; curr < temperatures.length; curr++) {
            while(!stack.isEmpty() && temperatures[curr] > temperatures[stack.peek()])
            {
                int prev = stack.pop();
                result[prev] = curr - prev;
            }
            stack.push(curr);
        }
        return result;
    }
}
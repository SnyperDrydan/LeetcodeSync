class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      if(position.length == 1)
        return 1;

      Stack<Double> stack = new Stack<>();
      int[][] arr = new int[position.length][2];

      for(int i = 0; i < position.length; i++) {
        arr[i][0] = position[i];
        arr[i][1] = speed[i];
      }

      Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

      for(int i = position.length -1; i >= 0; i--) {
        Double time = (double) (target - arr[i][0]) / arr[i][1];
        if(!stack.isEmpty() && stack.peek() >= time) {
          continue;
        }
        else {
          stack.push(time);
        }
      }

      return stack.size();
    }
}
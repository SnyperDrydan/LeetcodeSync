class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int i = 0, j = len-1, max = 0;

        while(i < j) {
            int w = j-i;
            int h = Math.min(height[i], height[j]);
            int area = w*h;
            max = Math.max(max, area);

            if(height[i] > height[j])
                j--;
            else
                i++;
        }

        return max;
    }
}
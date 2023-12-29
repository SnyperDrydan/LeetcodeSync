class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Set<Integer> xCoordinates = new TreeSet<>();
        
        for (int[] point : points) {
            xCoordinates.add(point[0]);
        }
        
        int maxDiff = 0;
        Integer prevX = null;
        
        for (int x : xCoordinates) {
            if (prevX != null) {
                maxDiff = Math.max(maxDiff, x - prevX);
            }
            prevX = x;
        }
        
        return maxDiff;
    }
}
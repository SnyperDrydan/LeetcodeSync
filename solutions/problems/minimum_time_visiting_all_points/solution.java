class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dist = 0;
        for(int i = 1; i < points.length; i++) {
            dist += distance(points[i][0], points[i-1][0], points[i][1], points[i-1][1]);
        }
        
        return dist;
    }

    public int distance(int x1, int x2, int y1, int y2) {
        return Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1));
    }
} 
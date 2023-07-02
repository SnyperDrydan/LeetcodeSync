class Solution {
    private int maxRequestsUtil(int i, int n, int[][] requests, int[] indegree, int[] outdegree) {
        if (i == requests.length) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (indegree[j] == outdegree[j]) {
                    count += indegree[j];
                } else {
                    return 0;
                }
            }
            return count;
        }

        int from = requests[i][0], to = requests[i][1];

        // Include the current request
        indegree[to]++;
        outdegree[from]++;
        int includeCount = maxRequestsUtil(i + 1, n, requests, indegree, outdegree);
        indegree[to]--;
        outdegree[from]--;

        // Exclude the current request
        int excludeCount = maxRequestsUtil(i + 1, n, requests, indegree, outdegree);

        return Math.max(includeCount, excludeCount);
    }

    public int maximumRequests(int n, int[][] requests) {
        int[] indegree = new int[n];
        int[] outdegree = new int[n];

        return maxRequestsUtil(0, n, requests, indegree, outdegree);
    }
}
class Solution {
    private boolean hasCycle(int u, List<List<Integer>> adjList, boolean[] visited, boolean[] recStack) {
        visited[u] = true;
        recStack[u] = true;

        List<Integer> neighbors = adjList.get(u);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                if (hasCycle(neighbor, adjList, visited, recStack))
                    return true;
            } else if (recStack[neighbor]) {
                return true;
            }
        }

        recStack[u] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            adjList.get(course).add(prerequisiteCourse);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (hasCycle(i, adjList, visited, recStack))
                    return false;
            }
        }

        return true;
    }
}

package graphs;

import java.util.*;

public class BreadthFirst {
    private static void breadthFirstTraversal(int v, int start, List<List<Integer>> adjList) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[v];
        q.add(start);
        visited[start]=true;
        while (q.size() != 0) {
            int p = q.poll();
            System.out.print(p + " ");
            List<Integer> neighbors = adjList.get(p);
            for (int n : neighbors) {
                if (visited[n] == false) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        adjList.add(0, Arrays.asList(1, 2));
        adjList.add(1, Arrays.asList(0, 2, 3));
        adjList.add(2, Arrays.asList(0, 1, 4));
        adjList.add(3, Arrays.asList(1, 4));
        adjList.add(4, Arrays.asList(2, 3));
        breadthFirstTraversal(5,0,adjList);
    }
}

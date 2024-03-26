package graphs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int vertices = s.nextInt();
        int[][] adj = new int[vertices + 1][vertices + 1];

        s.nextLine();

        //get edges
        for (int i = 0; i < vertices + 1; ++i) {
            int[] edges = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int u = edges[0], v = edges[1];
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        //print adjacency matrix
        for (int i = 0; i < vertices + 1; ++i) {
            for (int j = 0; j < vertices + 1; ++j) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }

}

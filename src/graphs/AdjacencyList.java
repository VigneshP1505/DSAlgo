package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AdjacencyList {

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        for (int i = 0; i < v; ++i) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < v ; ++i) {
            System.out.print("Enter the vertex:");
            int vertex = s.nextInt();
            s.nextLine();
            System.out.println("Enter neighbors separated by space:");
            int[] neighbors =
                    Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int neighbor:neighbors){
                adjList.get(vertex).add(neighbor);
            }
        }

        //printing neighbors
        for(int i=0;i<v;++i){
            List<Integer> neighbors=adjList.get(i);
            System.out.println(String.format("For vertex %d, the neighbors are:",i)+neighbors);
        }


    }

}

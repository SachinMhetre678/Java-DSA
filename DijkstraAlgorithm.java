package Daal;
import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        // Hardcoded number of vertices
        int vertices = 4;

        // Hardcoded adjacency matrix (example graph)
        int[][] graph = {
                {0, 10, 15, 0},
                {10, 0, 35, 25},
                {15, 35, 0, 20},
                {0, 25, 20, 0}
        };

        // Hardcoded source vertex
        int source = 0;

        // Initialize distances and shortest path set
        int[] distance = new int[vertices];
        boolean[] shortestPathSet = new boolean[vertices];
        Arrays.fill(shortestPathSet, false);
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        // Implement Dijkstra's Algorithm
        for (int count = 0; count < vertices - 1; count++) {
            int mini = Integer.MAX_VALUE;
            int u = -1;
            for (int v = 0; v < vertices; v++) {
                if (!shortestPathSet[v] && distance[v] < mini) {
                    mini = distance[v];
                    u = v;
                }
            }

            shortestPathSet[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!shortestPathSet[v] && graph[u][v] != 0 && distance[u] != Integer.MAX_VALUE && distance[u] + graph[u][v] < distance[v]) {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        // Output the result
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t" + distance[i]);
        }
    }
}


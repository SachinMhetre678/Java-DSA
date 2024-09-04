import java.util.Arrays;

public class primsalgo {
    public static void main(String[] args) {
        // Hardcoded number of vertices
        int vertices = 4;

        // Hardcoded adjacency matrix
        int[][] graph = {
                {0, 2, 0, 6},
                {2, 0, 3, 8},
                {0, 3, 0, 4},
                {6, 8, 4, 0}
        };

        // Arrays to store the MST results
        int[] parent = new int[vertices];
        int[] key = new int[vertices];
        boolean[] mstset = new boolean[vertices];

        // Initialize arrays
        Arrays.fill(mstset, false);
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        // Prim's algorithm
        for (int count = 0; count < vertices - 1; count++) {
            // Find the minimum key vertex that is not yet included in the MST
            int mini = Integer.MAX_VALUE;
            int u = -1;
            for (int v = 0; v < vertices; v++) {
                if (!mstset[v] && key[v] < mini) {
                    mini = key[v];
                    u = v;
                }
            }

            // Include the picked vertex in the MST
            mstset[u] = true;

            // Update the key value and parent index of the adjacent vertices
            for (int v = 0; v < vertices; v++) {
                if (graph[u][v] != 0 && !mstset[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        // Output the result
        System.out.println("Edge\tWeight");
        int totalCost = 0;
        for (int i = 1; i < vertices; i++) {
            System.out.println(parent[i] + "-" + i + "\t" + graph[i][parent[i]]);
            totalCost += graph[i][parent[i]];
        }
        System.out.println("Total cost of the Minimum Spanning Tree: " + totalCost);
    }
}

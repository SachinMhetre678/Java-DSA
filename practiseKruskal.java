import java.util.Arrays;

public class practiseKruskal {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    int[] parent;
    int[] rank;

    practiseKruskal(int vertices) {
        parent = new int[vertices];
        rank = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int k) {
        if (parent[k] != k) {
            parent[k] = find(parent[k]); // Path compression
        }
        return parent[k];
    }

    void union(int a, int b) {
        int roota = find(a);
        int rootb = find(b);
        if (roota != rootb) {
            if (rank[roota] > rank[rootb]) {
                parent[rootb] = roota;
            } else if (rank[roota] < rank[rootb]) {
                parent[roota] = rootb;
            } else {
                parent[rootb] = roota;
                rank[roota]++;
            }
        }
    }

    void bubbleSort(Edge[] edges) {
        int n = edges.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (edges[j].weight > edges[j + 1].weight) {
                    // Swap edges[j] and edges[j + 1]
                    Edge temp = edges[j];
                    edges[j] = edges[j + 1];
                    edges[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Hardcoded input
        int V = 4; // Number of vertices
        Edge[] edges = new Edge[]{
                new Edge(0, 1, 10),
                new Edge(0, 2, 6),
                new Edge(0, 3, 5),
                new Edge(1, 3, 15),
                new Edge(2, 3, 4)
        };

        practiseKruskal p = new practiseKruskal(V);
        p.bubbleSort(edges); // Use bubble sort to sort edges

        int mstcost = 0;
        System.out.println("Edges in the MST:");
        for (Edge edge : edges) {
            int srcset = p.find(edge.src);
            int destset = p.find(edge.dest);
            if (srcset != destset) {
                p.union(srcset, destset);
                System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
                mstcost += edge.weight;
            }
        }
        System.out.println("Final cost of MST: " + mstcost);
    }
}

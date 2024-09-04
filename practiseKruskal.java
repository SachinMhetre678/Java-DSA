import java.util.Arrays;

public class practiceKruskal {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    int[] parent;

    practiceKruskal(int vertices) {
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }
    }

    int find(int k) {
        if (parent[k] == k) {
            return k;
        }
        return find(parent[k]);
    }

    void union(int a, int b) {
        int roota = find(a);
        int rootb = find(b);
        parent[roota] = rootb;
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices (hardcoded)
        int E = 5; // Number of edges (hardcoded)
        
        // Hardcoded edges (source, destination, weight)
        Edge[] edges = new Edge[] {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };
        
        practice p = new practice(V);
        Arrays.sort(edges, (a, b) -> a.weight - b.weight); // Sort edges by weight
        
        int mstcost = 0;
        System.out.println("Edges in the MST:");
        for (Edge edge : edges) {
            int srcset = p.find(edge.src);
            int destset = p.find(edge.dest);
            if (srcset != destset) {
                p.union(srcset, destset);
                System.out.println("Source: " + edge.src + " - Destination: " + edge.dest + " - Weight: " + edge.weight);
                mstcost += edge.weight;
            }
        }
        System.out.println("Final cost of MST: " + mstcost);
    }
}

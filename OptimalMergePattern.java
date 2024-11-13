
import java.util.PriorityQueue;

public class OptimalMergePattern {

    // Function to calculate the minimum cost of merging files
    public static int minimumMergeCost(int[] fileSizes) {
        // Initialize a priority queue (min-heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all file sizes to the min-heap
        for (int size : fileSizes) {
            minHeap.add(size);
        }

        int totalCost = 0;

        // While there are more than one files in the heap
        while (minHeap.size() > 1) {
            // Extract the two smallest files
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Merge them and calculate the cost
            int mergeCost = first + second;
            totalCost += mergeCost;

            // Add the merged file back to the heap
            minHeap.add(mergeCost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] fileSizes = {4, 3, 2, 6};

        int result = minimumMergeCost(fileSizes);
        System.out.println("Minimum cost to merge all files: " + result);
    }
}


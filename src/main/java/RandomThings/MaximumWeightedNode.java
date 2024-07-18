package RandomThings;
import java.util.*;

public class MaximumWeightedNode {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Input number of cells
    System.out.println("Enter the number of cells:");
    int N = scanner.nextInt();

    // Input array of edges
    System.out.println("Enter the edge values:");
    int[] edges = new int[N];
    for (int i = 0; i < N; i++) {
      edges[i] = scanner.nextInt();
    }

    // Calculate weights of each cell    4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
    long[] weights = new long[N];
    for (int i = 0; i < N; i++) {
      if (edges[i] != -1) {
        weights[edges[i]] += i; // Sum of cell indexes pointing to the current cell
      }
    }

    // Find cell with maximum weight
    long maxWeight = Long.MIN_VALUE;
    int maxWeightCell = -1;
    for (int i = 0; i < N; i++) {
      if (weights[i] > maxWeight) {
        maxWeight = weights[i];
        maxWeightCell = i;
      } else if (weights[i] == maxWeight && i > maxWeightCell) {
        // If there are multiple cells with the same maximum weight, select the one with the highest index
        maxWeightCell = i;
      }
    }

    // Output the cell with maximum weight
    System.out.println("Maximum Weighted Node is "+ maxWeightCell);

    scanner.close();
  }
}


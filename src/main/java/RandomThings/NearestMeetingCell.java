package RandomThings;
import java.util.*;

public class NearestMeetingCell{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input number of cells
    int N = scanner.nextInt();

    // Input array of edges
    int[] edges = new int[N];
    for (int i = 0; i < N; i++) {
      edges[i] = scanner.nextInt();
    }

    // Input the two cell numbers
    int cell1 = scanner.nextInt();
    int cell2 = scanner.nextInt();

    // Find the nearest meeting cell
    int nearestMeetingCell = findNearestMeetingCell(N, edges, cell1, cell2);

    // Output the result
    System.out.println(nearestMeetingCell);

    scanner.close();
  }

  // Function to find the nearest meeting cell
  public static int findNearestMeetingCell(int n, int[] edge, int cell1, int cell2) {
    int[] dist1 = new int[n];
    int[] dist2 = new int[n];
    Arrays.fill(dist1, Integer.MAX_VALUE);
    Arrays.fill(dist2, Integer.MAX_VALUE);

    bfs(n, edge, dist1, cell1);
    bfs(n, edge, dist2, cell2);

    int minDistance = Integer.MAX_VALUE;
    int nearestMeetingCell = -1;

    for (int i = 0; i < n; i++) {
      if (dist1[i] != Integer.MAX_VALUE && dist2[i] != Integer.MAX_VALUE) {
        int totalDistance = dist1[i] + dist2[i];
        if (totalDistance < minDistance) {
          minDistance = totalDistance;
          nearestMeetingCell = i;
        }
      }
    }

    return nearestMeetingCell;
  }

  // Function for BFS traversal to find distances from a source cell
  public static void bfs(int n, int[] edge, int[] dist, int source) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(source);
    dist[source] = 0;

    while (!queue.isEmpty()) {
      int currentCell = queue.poll();
      int nextCell = edge[currentCell];

      if (nextCell != -1 && dist[nextCell] == Integer.MAX_VALUE) {
        dist[nextCell] = dist[currentCell] + 1;
        queue.add(nextCell);
      }
    }
  }
}


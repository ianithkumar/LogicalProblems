package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Input : [3,9,20,null,null,15,17]   Output : [3.0, 14.5, 16.0]

public class AverageOfLevelsOfBinaryTree {
  public static void main(String[] a) {
    TreeNode head = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(17)));
    List<Double> result = averageOfLevelsOfBinaryTree(head);
    System.out.println(result);
  }

  private static List<Double> averageOfLevelsOfBinaryTree(TreeNode head) {
    List<Double> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(head);
    while (queue.size() > 0) {
      int sum = 0;
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        sum = sum + node.val;

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      result.add((double) sum / size);
    }
    return result;
  }
}

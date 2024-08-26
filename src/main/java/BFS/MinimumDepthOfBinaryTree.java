package BFS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MinimumDepthOfBinaryTree {
  public static void main(String[] a) {
    TreeNode head = new TreeNode(3, new TreeNode(9, new TreeNode(5), new TreeNode(7)), new TreeNode(20, new TreeNode(15), new TreeNode(17)));
    int result = minimumDepthOfBinaryTree(head);
    System.out.println("The Minimum Depth Level Of Binary Tree Is : ");
    System.out.println(result);
  }

  private static int minimumDepthOfBinaryTree(TreeNode head) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    int levelSum = 0;
    queue.offer(head);


    while (queue.size() > 0) {
      int size = queue.size();
      levelSum = levelSum + 1;

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        if (node.left == null || node.right == null) {
          return levelSum;
        }
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
    }

    return levelSum;
  }
}

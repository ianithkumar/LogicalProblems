package BFS;


import java.util.*;

//Input : [3,9,20,null,null,15,17]   Output : [[3], [9, 20], [15, 17]]

public class BinaryTreeLevelOrderTraversal {
  public static void main(String[] a) {
    TreeNode head = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(17)));
//  head.left = new TreeNode(9);
//  head.right = new TreeNode(20, new TreeNode(15), new TreeNode(17));
    List<List<Integer>> result = levelOrder(head);
    System.out.println(result);
  }

  private static List<List<Integer>> levelOrder(TreeNode head) {
    List<List<Integer>> bigList = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();

    if (head == null) {
      return bigList;
    }
    queue.offer(head);

    while (queue.size() > 0) {
      int size = queue.size();
      List<Integer> smallList = new ArrayList<>();

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        smallList.add(node.val);

        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }


      }
      bigList.add(smallList);
    }
    return bigList;
  }
}

package BFS;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//[3,9,20,null,null,15,17]

public class LevelOrderTraversal {
  public static void main(String[] a) {
    TreeNode head = new TreeNode(3);
    head.left = new TreeNode(9);
    head.right = new TreeNode(20, new TreeNode(15), new TreeNode(17));
    List<List<Integer>> result = levelOrder(head);
    System.out.println(result);
  }

  private static List<List<Integer>> levelOrder(TreeNode head) {
    List<List<Integer>> bigList = new ArrayList<>();
    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(head.val);

    while (queue.size() > 0) {
      int size = queue.size();
      List<Integer> smallList = new ArrayList<>();

      for (int i = 0; i < size; i++) {
        int node = queue.poll();
        smallList.add(node);


      }
      bigList.add(smallList);
    }
    return bigList;
  }
}

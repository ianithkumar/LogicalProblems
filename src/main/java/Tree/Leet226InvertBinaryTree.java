package Tree;

// Output = [4,7,2,9,6,3,1]
public class Leet226InvertBinaryTree {
  public static void main(String[] a) {
    TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
    TreeNode result = invertBinaryTree(root);
    System.out.print(result.val + " ");
    System.out.print(result.left.val + " ");
    System.out.print(result.right.val + " ");
    System.out.print(result.left.left.val + " ");
    System.out.print(result.left.right.val + " ");
    System.out.print(result.right.left.val + " ");
    System.out.print(result.right.right.val + " ");
  }

  private static TreeNode invertBinaryTree(TreeNode root) {
    if (root == null) {
      return root;
    }
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    invertBinaryTree(root.left);
    invertBinaryTree(root.right);

    return root;
  }

}

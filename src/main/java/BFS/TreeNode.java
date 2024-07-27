package BFS;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode(int val){   //To handle a node which has no children
    this.val = val;
  }
  public TreeNode(int val,TreeNode left,TreeNode right){
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

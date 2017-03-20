package Question_226_InvertBinaryTree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        final TreeNode left = root.left,
                right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
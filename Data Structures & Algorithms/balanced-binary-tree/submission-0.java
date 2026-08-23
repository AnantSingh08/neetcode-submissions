/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        maxHeight(root);
        return isBalanced;
    }
    int maxHeight(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = maxHeight(node.left);
        int rightHeight = maxHeight(node.right);

        isBalanced = isBalanced && Math.abs(leftHeight-rightHeight) <= 1;
        return 1 + Math.max(
            leftHeight,
            rightHeight
        );
    }
}

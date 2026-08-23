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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        maxHeight(root);
        return diameter;
    }

    private int maxHeight(TreeNode root) {
        if(root == null) return 0;

        int leftHeight =  maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        diameter = Math.max(diameter, rightHeight+leftHeight);
        return 1+Math.max(
           leftHeight,
            rightHeight
        );
    }
}

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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<TreeNode> minHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.val, b.val)
        );
        if(root==null) return 0;
        dfs(root, minHeap);
        for(int i=1;i<k;i++) {
            minHeap.poll();
        }
        return minHeap.poll().val;

    }
    private void dfs(TreeNode node, PriorityQueue<TreeNode> minHeap) {
        if(node == null) return;
        minHeap.add(node);
        dfs(node.left, minHeap);
        dfs(node.right, minHeap);
    }
}

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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        while (root != null && (root.val < low || root.val > high)) {
            if (root.val < low) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        if (root == null) {
            return null;
        }
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null && curr.left.val < low) {
                curr.left = curr.left.right;
            } else {
                curr = curr.left;
            }
        }
        curr = root;
        while (curr != null) {
            if (curr.right != null && curr.right.val > high) {
                curr.right = curr.right.left;
            } else {
                curr = curr.right;
            }
        }
        return root;
    }
}
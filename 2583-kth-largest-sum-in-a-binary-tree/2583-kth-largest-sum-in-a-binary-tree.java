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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        Queue<TreeNode> q = new ArrayDeque<TreeNode>();
        if (root == null)
            return -1;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            int i = 0;
            long sum = 0;
            while (i < n) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                sum += temp.val;
                i++;
            }
            if (pq.size() < k) {
                pq.add(sum);
            } else {
                if (pq.peek() < sum) {
                    pq.poll();
                    pq.add(sum);
                }
            }
        }
        if (pq.size() < k)
            return -1;
        return pq.peek();

    }

}
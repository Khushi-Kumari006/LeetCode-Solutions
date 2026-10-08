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
    private void inorder(TreeNode root,int level,List<Long> al){
        if(root==null)return;
        if(al.size()==level){
            al.add(0L);
        }
        al.set(level,al.get(level)+root.val);
        inorder(root.left,level+1,al);
        inorder(root.right,level+1,al);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> al=new ArrayList<>();
        inorder(root,0,al);
        if(al.size()<k)return -1;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long val:al){
            pq.offer(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}
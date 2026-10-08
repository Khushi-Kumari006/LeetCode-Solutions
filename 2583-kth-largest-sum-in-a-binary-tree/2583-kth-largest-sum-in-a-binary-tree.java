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
        List<List<Integer>> l1 = new ArrayList<>();
        if(root==null){
            return (long) 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                currLevel.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            l1.add(currLevel);
        }
        if(k>l1.size()){
            return (long)-1;
        }
        long[] arr = new long[l1.size()];
        for(int i=0;i<l1.size();i++){
            long s = 0;
            for(int j=0;j<l1.get(i).size();j++){
                s+=(long)l1.get(i).get(j);
            }
            arr[i] = s;
        }
        Arrays.sort(arr);
        return arr[l1.size()-k];
    }
}
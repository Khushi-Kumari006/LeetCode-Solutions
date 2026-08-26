class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer i : nums){
            pq.add(i);
        }
        while(!pq.isEmpty()){
            int curr = pq.poll();
            for(int j=1; j<k; j++){
                if(!pq.remove(curr + j)) return false;
            }
        }
        return true;
    }
}
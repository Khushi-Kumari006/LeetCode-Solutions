class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ps = 0;
        int cnt=0;
        for(int i=0; i<nums.length; i++) {
            ps+= nums[i];
            if(map.containsKey(ps - goal)) {
                cnt += map.get(ps - goal);
            }
            map.put(ps, map.getOrDefault(ps, 0) + 1);
        }
        return cnt;
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : nums)
            if (map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1))
                ans.add(i);
        return ans;
        
    }
}
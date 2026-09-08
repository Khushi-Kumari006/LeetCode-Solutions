class Solution {
    public int maximizeGreatness(int[] nums) {
        var count = new HashMap<Integer, Integer>();
        int k = 0;
        for (int a : nums)
            k = Math.max(k, count.merge(a, 1, Integer::sum));
        return nums.length - k;
        
    }
}
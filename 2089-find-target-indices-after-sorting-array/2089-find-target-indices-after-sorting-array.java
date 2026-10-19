class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int start = 0, count = 0;
        for(int num : nums){
            if(num < target)
                start++;
            else if(num == target)
                count++;
        }
        List<Integer> result = new ArrayList<>(count);
        for (int i = start; i < start + count; i++) {
            result.add(i);
        }
        return result;
    }
}
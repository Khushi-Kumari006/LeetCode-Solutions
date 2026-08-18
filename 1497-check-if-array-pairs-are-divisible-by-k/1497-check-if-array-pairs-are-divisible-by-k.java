class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int rem1 = entry.getKey();
            int cnt = entry.getValue();
            int rem2 = (k - rem1) % k;
            if (!map.containsKey(rem2)) {
                return false;
            }
            if (rem1 == rem2) {
                if (cnt % 2 != 0) {
                    return false;
                }
            } else if (map.get(rem2) != cnt) {
                return false;
            }
        }
        return true;
    }
}
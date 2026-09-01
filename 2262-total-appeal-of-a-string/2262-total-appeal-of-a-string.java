class Solution {
    public long appealSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        long total = 0;
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                count += i - map.get(c);
            } else {
                count += i + 1;
            }
            total += count;
            map.put(c, i);
        }
        return total;
    }
}
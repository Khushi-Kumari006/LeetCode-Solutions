class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if (n == 1) return 0;
        if (n == 2) {
            if (s.charAt(0) > s.charAt(1)) return -1;
            return 0;
        }
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);
        String t = new String(sorted);
        if (s.equals(t)) return 0;
        if (s.charAt(0) == t.charAt(0) || s.charAt(n - 1) == t.charAt(n - 1)) 
        return 1;
        char[] a = s.toCharArray();
        char[] b = s.toCharArray();
        Arrays.sort(a, 0, n - 1);
        Arrays.sort(b, 1, n);
        Arrays.sort(a, 1, n);
        Arrays.sort(b, 0, n - 1);
        if (new String(a).equals(t) || new String(b).equals(t)) return 2;
        return 3;
    }
}
class Solution {
    List<Integer> list;
    void dfs(int num, int low, int high) {
        if(num >= low && num <= high) {
            list.add(num);
            int prev = num % 10;
            if(prev == 9) return;
            int cur = num * 10 + (prev + 1);
            dfs(cur, low, high);
        } else if(num < low) {
            int prev = num % 10;
            if(prev == 9) return;
            int cur = num * 10 + (prev + 1);
            dfs(cur, low, high);
        }
    }
    public List<Integer> sequentialDigits(int low, int high) {
        list = new ArrayList<>();
        for(int i = 1; i < 9; i++) dfs(i, low, high);
        Collections.sort(list);
        return list;
    }
}
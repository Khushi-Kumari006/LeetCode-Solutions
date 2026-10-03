class Solution {
    public int maxDistance(String moves) {
        int x = 0, y = 0, extra = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') x++;
            else if (c == 'D') x--;
            else if (c == 'L') y++;
            else if (c == 'R') y--;
            else extra++;
        }
        return Math.abs(x) + Math.abs(y) + extra;
    }
}
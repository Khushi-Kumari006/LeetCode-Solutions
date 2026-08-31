class Solution {
    public String alphabetBoardPath(String target) {
        int curr = 0;
        StringBuilder str = new StringBuilder();
        for (char ch : target.toCharArray()) {
            int pos = ch - 'a';
            while (true) {
                if (curr < pos) {
                    for (int i = curr / 5; i < pos / 5; i++) {
                        if (curr + 5 < 26) {
                            str.append('D');
                            curr += 5;
                        }
                    }
                    curr = horizontalMove(curr, pos, str);
                }
                else if (curr > pos) {
                    for (int i = curr / 5; i > pos / 5; i--) {
                        if (curr - 5 >= 0) {
                            str.append('U');
                            curr -= 5;
                        }
                    }
                    curr = horizontalMove(curr, pos, str);
                }
                if (curr == pos) {
                    break;
                }
            }
            str.append('!');
        }
        return str.toString();
    }
    public int horizontalMove(int curr, int pos, StringBuilder str) {
        if (curr < pos) {
            if (curr / 5 == pos / 5) {
                for (int i = curr; i < pos; i++) {
                    if (curr + 1 < 26) {
                        str.append('R');
                        curr++;
                    }
                }
            }
            else {
                while (curr % 5 != pos % 5) {
                    if (curr - 1 >= 0) {
                        str.append('L');
                        curr--;
                    }
                }
            }
        }
        else if (curr > pos) {
            if (curr / 5 == pos / 5) {
                for (int i = curr; i > pos; i--) {
                    if (curr - 1 >= 0) {
                        str.append('L');
                        curr--;
                    }
                }
            }
        }
        return curr;
    }
}
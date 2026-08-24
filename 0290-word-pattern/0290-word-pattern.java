class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String mappedWord = null;
            for (int j = 0; j < i; j++) {
                if (pattern.charAt(j) == ch) {
                    mappedWord = words[j];
                    break;
                }
            }
            if (mappedWord != null) {
                if (!mappedWord.equals(words[i])) {
                    return false;
                }
            } else {
                for (int j = 0; j < i; j++) {
                    if (words[j].equals(words[i]) && pattern.charAt(j) != ch) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
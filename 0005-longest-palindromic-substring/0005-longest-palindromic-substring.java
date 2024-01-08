class Solution {
    int begin, lenCnt;
    
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            extendSubstring(s, i, i);
            extendSubstring(s, i, i + 1);
        }
        
        return s.substring(begin, begin + lenCnt);
    }
    
    void extendSubstring(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        
        if (lenCnt < k - j - 1) {
            begin = j + 1;
            lenCnt = k - j - 1;
        }
    }
}
class Solution {
    int lo, maxLen;
    
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            extendSubstring(s, i, i);
            extendSubstring(s, i, i + 1);
        }
        
        return s.substring(lo, lo + maxLen);
    }
    
    void extendSubstring(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
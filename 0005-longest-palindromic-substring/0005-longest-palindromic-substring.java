class Solution {
    int palindromStartAt = 0, maxLen = 0;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            extendAroundCenter(s, i, i); // odd
            extendAroundCenter(s, i, i + 1); // even
        }
        
        return s.substring(palindromStartAt, palindromStartAt + maxLen);
    }
    
    void extendAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        if (maxLen < right - left - 1) {
            palindromStartAt = left + 1;
            maxLen = right - left - 1;
        }
    }
}
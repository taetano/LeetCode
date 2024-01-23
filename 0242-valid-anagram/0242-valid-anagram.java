class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] cnt = new int[26];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            cnt[c - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (--cnt[c - 'a'] < 0) return false;
        }
        
        return true;
    }
}
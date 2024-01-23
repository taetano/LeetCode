class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        
        int p1 = 0;
        int p2 = 0;
        while (p1 < t.length() && p2 < s.length()) {
            char c1 = t.charAt(p1++);
            char c2 = s.charAt(p2);
            if (c1 == c2) p2++;
        }
        
        return s.length() == p2;
    }
}
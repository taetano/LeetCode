class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        
        int left = 0, right = s.length() - 1;
        
        while (left < right) {            
            while (left < right && !ok(s.charAt(left))) left++;
            while (left < right && !ok(s.charAt(right))) right--;
            
            if (left < right && s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
    }
    
    boolean ok(char c) {
        return Character.isLetterOrDigit(c);
    }
}
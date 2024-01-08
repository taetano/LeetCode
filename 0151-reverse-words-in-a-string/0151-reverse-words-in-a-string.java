class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        while (idx < s.trim().length()) {
            StringBuilder tmp = new StringBuilder();
            while (idx < s.length() && Character.isLetterOrDigit(s.charAt(idx))) {
                tmp.append(s.charAt(idx++));
            }
            sb.insert(0, tmp);
            
            if (idx < s.length()) {
                while (idx < s.length() && Character.isSpace(s.charAt(idx))) {
                    idx++;
                }
                sb.insert(0, ' ');
            }
        }
        
        return sb.toString();
    }
}
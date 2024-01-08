class Solution {
    public String reverseWords(String s) {
        s = new StringBuilder(s.trim()).reverse().toString();
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        while (idx < s.length()) {
            int start = idx, end = 0;
            while (idx < s.length() && !Character.isSpace(s.charAt(idx))) {
                idx++;
                end = idx;
            }
            sb.append(new StringBuilder(s.substring(start, end)).reverse().toString());
            
            if (idx < s.length()) {
                sb.append(' ');
                while (idx < s.length() && Character.isSpace(s.charAt(idx))) {
                    idx++;       
                }
            }
        }
        
        return sb.toString();
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        // String[] strArr = s.trim().split("\\s+");
        // return strArr[strArr.length - 1].length();
        
        int cnt = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isSpace(s.charAt(i))) break;
            cnt++;
        }
        
        return cnt;
    }
}
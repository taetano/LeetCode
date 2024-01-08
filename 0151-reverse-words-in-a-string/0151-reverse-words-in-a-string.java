class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i > 0; i--) {
            sb.append(strArr[i]).append(' ');
        }
        sb.append(strArr[0]);
        
        return sb.toString();
    }
}
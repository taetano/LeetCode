class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.trim().split("\\s+");
        return strArr[strArr.length - 1].length();
    }
}
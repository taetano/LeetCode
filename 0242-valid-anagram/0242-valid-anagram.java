class Solution {
    public boolean isAnagram(String s, String t) {
        // 정렬 후 문자열 비교
        s = s.chars()
            .sorted()
            .collect(StringBuilder::new,
                     StringBuilder::appendCodePoint,
                     StringBuilder::append)
            .toString();
        
        t = t.chars()
            .sorted()
            .collect(StringBuilder::new,
                     StringBuilder::appendCodePoint,
                     StringBuilder::append)
            .toString();
        
        return s.equals(t);
        // mpa counting
            
        // array counting
    }
}
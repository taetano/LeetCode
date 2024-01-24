class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> words = new HashSet<>();
        Set<Integer> doubleWords = new HashSet<>();
        List<String> ans = new ArrayList<>();
        int[] map = new int[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;
        
        for (int i = 0; i + 10 <= s.length(); i++) {
            int v = 0;
            for (int j = i; j < i + 10; j++) {
                v <<= 2;
                v |= map[s.charAt(j) - 'A'];
            }
            if (!words.add(v) && doubleWords.add(v)) {
                ans.add(s.substring(i, i + 10));
            }
        }
        
        return ans;
    }
}
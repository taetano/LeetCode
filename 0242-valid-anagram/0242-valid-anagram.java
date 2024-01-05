class Solution {
    public boolean isAnagram(String s, String t) {
        // #1 정렬 후 문자열 비교
//         s = s.chars()
//             .sorted()
//             .collect(StringBuilder::new,
//                      StringBuilder::appendCodePoint,
//                      StringBuilder::append)
//             .toString();
        
//         t = t.chars()
//             .sorted()
//             .collect(StringBuilder::new,
//                      StringBuilder::appendCodePoint,
//                      StringBuilder::append)
//             .toString();
        
//         return s.equals(t);
        
        // #2 mpa counting
//         if (s.length() != t.length()) return false;
        
//         Map<Character,Integer> map = new HashMap<>();
        
//         for (int i = 0; i < s.length(); i++) {
//             char sKey = s.charAt(i);
//             char tKey = t.charAt(i);
//             map.put(sKey, map.getOrDefault(sKey, 0) + 1);
//             map.put(tKey, map.getOrDefault(tKey, 0) - 1);
//         }
        
//         for (Map.Entry<Character,Integer> it : map.entrySet()) {
//             if (it.getValue() != 0) return false;
//         }
        
//         return true;
        
        // #3 array counting
        if (s.length() != t.length()) return false;
        
        int[] counter = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            counter[sChar - 'a']++;
            counter[tChar - 'a']--;
        }
        
        for (int num : counter) {
            if (num != 0) return false;
        }
        
        return true;
    }
}
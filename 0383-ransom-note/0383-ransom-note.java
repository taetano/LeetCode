class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // # using array
//         int[] arr = new int[26];
//         for (char each : ransomNote.toCharArray()) {
//             arr[each - 'a']++;
//         }
        
//         for (char each : magazine.toCharArray()) {
//             arr[each - 'a']--;
//         }
        
//         for (int each : arr) {
//             if (each > 0) return false;
//         }
        
//         return true;
        
        // using hashMap
        
        Map<Character, Integer> map = new HashMap<>();
        for (char each : ransomNote.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        
        for (char each : magazine.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) - 1);
            }
        }
        
        
        for (int val : map.values()) {
            if (val > 0) return false;
        }
        
        return true;
    }
}
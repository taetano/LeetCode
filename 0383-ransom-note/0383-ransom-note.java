class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char each : ransomNote.toCharArray()) {
            arr[each - 'a']++;
        }
        
        for (char each : magazine.toCharArray()) {
            arr[each - 'a']--;
        }
        
        for (int each : arr) {
            if (each > 0) return false;
        }
        
        return true;
    }
}
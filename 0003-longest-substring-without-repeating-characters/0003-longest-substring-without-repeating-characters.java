class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Deque<Character> deque = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        for (char each : s.toCharArray()) { 
            while (!set.add(each)) {
                char c = deque.removeFirst();
                set.remove(c);
            }
            
            deque.addLast(each);
            set.add(each);
            max = Math.max(max, deque.size());    
        }
     
        return max;
    }
}
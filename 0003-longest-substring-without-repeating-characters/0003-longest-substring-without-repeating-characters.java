class Solution {
    public int lengthOfLongestSubstring(String s) {
        // #1 set 으로 중복 카운팅 -> 하나 이상 존재하면 안되기에 map보다 적절하다고 생각함
//         int max = 0;
//         Deque<Character> deque = new LinkedList<>();
//         Set<Character> set = new HashSet<>();
//         for (char each : s.toCharArray()) { 
//             while (!set.add(each)) {
//                 char c = deque.removeFirst();
//                 set.remove(c);
//             }
            
//             deque.addLast(each);
//             set.add(each);
//             max = Math.max(max, deque.size());    
//         }
     
//         return max;
        
        // #2 map 으로 중복 카운팅
//         int max = 0;
//         Deque<Character> queue = new LinkedList<>();
//         Map<Character, Integer> map = new HashMap<>();
//         for (char each : s.toCharArray()) {
            
//             while (map.containsKey(each)) { // map.get(each) != null
//                 char c = queue.removeFirst();
//                 map.remove(c); // map.put(c, null)
//             }
            
//             queue.addLast(each);
//             map.put(each, 0);
//             max = Math.max(max, queue.size());
//         }
        
//         return max;
        
        // #3 index
        if (s.length() < 2) return s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int begin = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                begin = Math.max(begin, map.get(s.charAt(i)) + 1);
            }
            
            map.put(s.charAt(i), i);
            end = i;
            max = Math.max(max, end - begin + 1);
        }
        
        return max;
    }
}
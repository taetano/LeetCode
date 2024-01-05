class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // #1 map count
//         if (s.length() <= 10) return Collections.emptyList();
        
//         Map<String, Integer> map = new HashMap<>();
//         for (int i = 0; i <= s.length() - 10; i++) {
//             String key = s.substring(i, i + 10);
//             map.put(key, map.getOrDefault(key, 0) + 1);
//         }
        
//         List<String> ans = new ArrayList<>();
//         for (Map.Entry<String, Integer> it : map.entrySet()) {
//             if (it.getValue() > 1) ans.add(it.getKey());
//         }
        
//         return ans;
        // #2 set count
        if (s.length() <= 10) return Collections.emptyList();
        
        Set<String> candi = new HashSet<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            if (candi.contains(str)) {
                set.add(str);
            } else candi.add(str);
        }
        
        return List.copyOf(set);
    }
}
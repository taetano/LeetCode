class Solution {
    public String longestCommonPrefix(String[] strs) {
        // #1
//         String prefix = strs[0];
        
//         for (int i = 1; i < strs.length; i++) {
//             while (strs[i].indexOf(prefix) != 0) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//             }
            
//             if (prefix.isEmpty()) return "";
//         }
        
//         return prefix;
        
        // #2 sorting
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            
            ans.append(first.charAt(i));
        }
        
        return ans.toString();
    }
}
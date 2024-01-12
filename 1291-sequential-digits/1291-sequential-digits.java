class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
//         int[] nums = {12,23,34,45,56,67,78,89,
//                          123,234,345,456,567,678,789,
//                          1234,2345,3456,4567,5678,6789,
//                          12345,23456,34567,45678,56789,
//                          123456,234567,345678,456789,
//                          1234567,2345678,3456789,
//                          12345678,23456789,
//                          123456789};
        
//         List<Integer> ans = new ArrayList<>();
        
//         for (int each : nums) {
//             if (each < low) continue;
//             if (each > high) break;
//             ans.add(each);
//         }
        
//         return ans;
        
        String str = "123456789";
        List<Integer> ans = new ArrayList<>();
        
        outer:
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; i + j <= str.length(); j++) {
                String tmp = str.substring(j, j + i);
                int val = Integer.parseInt(tmp);
                if (val < low) continue;
                if (val > high) break outer;
                ans.add(val);
                    
            }
        }
        
        return ans;
    }
}
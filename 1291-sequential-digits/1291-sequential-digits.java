class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str = "123456789";
        List<Integer> ans = new ArrayList<>();
        
        outer:
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; i + j <= 9; j++) {
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
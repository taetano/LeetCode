class Solution {
    public void rotate(int[] nums, int k) {
        // 배열 2개
        int[] ans = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            ans[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, ans.length);
    }
}
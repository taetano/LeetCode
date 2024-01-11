class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        for (int i = 0, pre = 1; i < nums.length; i++) {
            ans[i] = pre;
            pre *= nums[i];
        }
        
        for (int i = nums.length - 1, pre = 1; i >= 0; i--) {
            ans[i] *= pre;
            pre *= nums[i];
        }
        
        return ans;
    }
}
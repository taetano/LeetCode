class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) nums[i] = nums.length + 1;
        }
        
        
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) <= nums.length) {
            int idx = Math.abs(nums[i]) - 1;          
                nums[idx] = -Math.abs(nums[idx]);   
            }
        }
        

        int ans = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans = i + 1;
                break;
            }
        }
        
        return ans;
    }
}
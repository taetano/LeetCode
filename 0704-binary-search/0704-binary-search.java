class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            }
            
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        
        return ans;
    }
}
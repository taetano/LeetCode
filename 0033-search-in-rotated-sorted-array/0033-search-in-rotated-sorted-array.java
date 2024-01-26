class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[r]) l = m + 1;
            else r = m;
        }
        
        int k = l;
        l = 0; r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int realM = (m + k) % nums.length;
            if (nums[realM] == target) return realM;
            
            if (nums[realM] < target) l = m + 1;
            else r = m - 1;
        }
        
        return -1;
    }
}
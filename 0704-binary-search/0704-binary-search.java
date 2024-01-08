class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2; // (left / 2) + (right / 2)
            if (nums[mid] == target) return mid;
            
            if (nums[mid] < target) { // target is right side of mid
                left = mid + 1;
            } else { // target is left side of mid
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
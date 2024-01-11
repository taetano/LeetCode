class Solution {
    public void rotate(int[] nums, int k) {
        // 배열 2개
//         int[] ans = new int[nums.length];
        
//         for (int i = 0; i < nums.length; i++) {
//             ans[(i + k) % nums.length] = nums[i];
//         }

//         System.arraycopy(ans, 0, nums, 0, ans.length);

        // space O(1)  ex) [1, 2, 3, 4, 5, 6, 7]
        k %= nums.length;    // 0 <= k <= 10^5
        reverse(nums, 0, nums.length - 1); // [7, 6, 5, 4, 3, 2, 1]
        reverse(nums, 0, k - 1);           // [5, 6, 7, 4, 3, 2, 1]
        reverse(nums, k, nums.length - 1); // [5, 6, 7, 1, 2, 3, 4]
    }
    
    void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
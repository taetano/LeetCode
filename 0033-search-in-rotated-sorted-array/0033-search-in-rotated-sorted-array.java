class Solution {
    public int search(int[] nums, int target) {
        // # 값을 기준으로 정렬이 되어 있는 탐색구역을 제한하여 찾는다.
//         int left = 0, right = nums.length -1;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) return mid;
            
//             if (nums[left] <= nums[mid]) {
//                 if (nums[left] <= target && target < nums[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } else {
//                 if (nums[right] >= target && target > nums[mid]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }
        
        
//         return -1;
        
        // #2 
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) lo = mid + 1;
            else hi = mid;
        }
        
        int rot = lo;
        lo = 0; hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int realMid = (mid + rot) % nums.length;
            if (nums[realMid] == target) return realMid;
            
            if (nums[realMid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        
        return -1;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // TC: O(N) SC: O(N)
//         List<Integer> ans = new ArrayList<>(); // 
//         int[] arr = new int[nums.length + 1];
        
//         for (int each : nums) {
//             arr[each] = 1;
//         }
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] == 0) ans.add(i);
//         }
        
//         return ans;
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[tmp - 1] = tmp;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) ans.add(i + 1);
        }
        return ans;
    }
}
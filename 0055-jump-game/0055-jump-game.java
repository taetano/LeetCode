class Solution {

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        
        boolean[] arr = new boolean[nums.length];
        arr[0] = true;
        for (int i = 0; i < nums[0] && i + 1 < nums.length; i++) {
            arr[i + 1] = true;
        }
        
        for (int i = 1; i < nums.length; i++) {
            if (!arr[i]) return false;
            for (int j = i; j < i + nums[i] && j + 1 < nums.length; j++) {
                arr[j + 1] = true;
            }
            
            if (arr[arr.length - 1]) return true;
        }
        
        return false;
    }

}
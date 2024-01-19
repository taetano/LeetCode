class Solution {
    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        
        for (int each : nums) {
            cnt[each]++;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < cnt[0]; j++) nums[j] = 0;
            
            for (int j = cnt[0]; j < cnt[0] + cnt[1]; j++) nums[j] = 1;
            
            for (int j = cnt[0] + cnt[1]; j < cnt[0] + cnt[1] + cnt[2]; j++) nums[j] = 2;
        }
    }
}
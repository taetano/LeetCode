class Solution {
    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for (int each : nums) {
            cnt[each]++;
        }
        
        go(0, cnt[0], 0, nums);
        go(cnt[0], cnt[0] + cnt[1], 1, nums);
        go(cnt[0] + cnt[1], cnt[0] + cnt[1] + cnt[2], 2, nums);
    }
    
    void go(int start, int condi, int val, int[] nums) {
        for (int i = start; i < condi; i++) nums[i] = val;
    }
}
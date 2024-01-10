class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int each : nums) {
            if (map.containsKey(each)) return true;
            map.put(each, 0);
        }
        return false;
    }
}
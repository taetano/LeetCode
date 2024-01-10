class Solution {
    public boolean containsDuplicate(int[] nums) {
        // #using Map
        // Map<Integer,Integer> map = new HashMap<>();
        // for (int each : nums) {
        //     if (map.containsKey(each)) return true;
        //     map.put(each, 0);
        // }
        // return false;
        
        // # using set
        Set<Integer> set = new HashSet<>();
        for (int each : nums) {
            if (!set.add(each)) return true;
        }
        
        return false;
    }
}
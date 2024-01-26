/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canJump = function(nums) {
    let reachable = 0;
    for (i = 0; i < nums.length; i++) {
        if (i > reachable) return false;
        reachable = Math.max(reachable, i + nums[i]);
        if (reachable >= nums.length - 1) break;
    }
    
    return true;
};
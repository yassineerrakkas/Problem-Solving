/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    let ans = Array(2);
    for(let i = 0; i < nums.length; i++){
        if(map.has(nums[i])){
            ans[0] = i;
            ans[1] = map.get(nums[i]);
            return ans;
        }
        map.set(target-nums[i],i);
    }
    return ans;
};
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const res = new Array(nums.length).fill(1);

    let left = 1, right = 1;

    for (let i = 0; i < nums.length; i++) {
        res[i] *= left;               
        left *= nums[i];             
        res[nums.length - 1 - i] *= right; 
        right *= nums[nums.length - 1 - i]; 
    }

    return res;
};

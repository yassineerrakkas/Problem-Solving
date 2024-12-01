/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const res = Array(nums.length);
    let temp = 1;
    for(let i = 0; i < nums.length; i++){
        res[i] = temp;
        temp = temp*nums[i];
    }
    temp = 1;
    for(let i = nums.length-1; i >=0 ; i--){
        res[i] *= temp;
        temp = temp*nums[i];
    }
    return res;
};
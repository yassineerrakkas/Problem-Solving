class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if len(nums) == 1 : return nums[0]
        res = nums[0]
        l = 1
        r = 1
        for i in range(len(nums)):
            l = 1 if l == 0 else l
            r = 1 if r == 0 else r
            l *= nums[i]
            r *= nums[len(nums)-1-i]
            res = max(res,l,r)
        return res

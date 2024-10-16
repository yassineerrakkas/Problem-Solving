class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0]; 
        int currentMin = 1, currentMax = 1;
        for (int n : nums) {
            if (n == 0) {
                currentMin = 1; 
                currentMax = 1;
                res = Math.max(res, 0);
            } else {
                int temp = currentMax * n;
                currentMax = Math.max(Math.max(n, temp), currentMin * n);
                currentMin = Math.min(Math.min(n, temp), currentMin * n);
                res = Math.max(currentMax, res);
            }
        }
        return res;
    }
}

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            int current = nums[i];
            int a = 1;
            for(int j = i-1; j>= 0 ; j--){
                if(nums[j] < current) {
                    a = Math.max(a,dp[j]+1);
                }
            }
            dp[i] = a;
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
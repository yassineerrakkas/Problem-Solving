class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] freq = new boolean[n+1];
        if(n == 1){
            if(nums[0] == 1)
                return 2;
            else return 1;
        }
        for(int i = 0; i<n; i++){
            if(nums[i]<=n && nums[i] >0){
                freq[nums[i]] = true;
            }
        }
        for(int i = 1; i<=n; i++){
            if(!freq[i]){
                return i;
            }
        }
        return n+1;
    }
}
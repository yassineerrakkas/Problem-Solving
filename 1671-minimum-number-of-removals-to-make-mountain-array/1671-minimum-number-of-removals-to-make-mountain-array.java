class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int[] lis = new int[nums.length];
        int[] lds = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j >= 0; j--){
                if(nums[i] > nums[j])
                    lis[i] = Math.max(lis[i],lis[j]+1);
            }
        }
        for(int i = nums.length-1; i >=0 ; i--){
            for(int j = i; j < nums.length; j++){
                if(nums[i] > nums[j])
                    lds[i] = Math.max(lds[i],lds[j]+1);
            }
        }
        int res = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(lis[i] > 0 && lds[i] > 0)
                res = Math.min(res,nums.length - lds[i] - lis[i] - 1);
        }
        return res;
    }
}
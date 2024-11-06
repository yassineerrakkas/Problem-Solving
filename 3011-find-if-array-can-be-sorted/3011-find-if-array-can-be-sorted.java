class Solution {
    public boolean canSortArray(int[] nums) {
        int i = 0;
        int prevMax = 0;
        int n = nums.length;
        while(i < n){
            int c = Integer.bitCount(nums[i]);
            int j = i + 1;
            int min = nums[i], max = nums[i];
            while(j < n && c == Integer.bitCount(nums[j])){
                min = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);
                j++;
            }
            if(min < prevMax) return false;
            else{
                i = j;
                prevMax = max;
            }
        }
        return true;
    }
}
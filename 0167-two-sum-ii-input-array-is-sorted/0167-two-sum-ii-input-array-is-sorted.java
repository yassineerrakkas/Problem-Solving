class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(r>=l){
            int sum = nums[r] + nums[l];
            if(sum == target) return new int[] {l+1,r+1};
            if(sum > target) r--;
            else l++;
        }
        return null;
    }
}
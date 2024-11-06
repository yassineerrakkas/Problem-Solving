class Solution {
    public boolean canSortArray(int[] nums) {
        List<Integer> mins = new ArrayList();
        List<Integer> maxs = new ArrayList();
        int n = nums.length;
        int min = nums[0] , max = nums[0];
        for(int i = 0; i < n-1; i++){
            if(Integer.bitCount(nums[i]) == Integer.bitCount(nums[i+1])){
                min = Math.min(min,nums[i]);
                max = Math.max(max,nums[i]);
            }else{
                mins.add(Math.min(min,nums[i]));
                maxs.add(Math.max(max,nums[i]));
                min = nums[i+1];
                max = nums[i+1];
            }
        }
        mins.add(Math.min(min,nums[n-1]));
        maxs.add(Math.max(max,nums[n-1]));
        for(int i = 0; i<mins.size()-1; i++){
            if(maxs.get(i) > mins.get(i+1)) return false;
        }
        return true;
    }
}
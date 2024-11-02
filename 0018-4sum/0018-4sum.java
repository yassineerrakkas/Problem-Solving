class Solution {
    List<List<Integer>> result;
    int [] nums;
    List<Integer> list;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        this.nums = nums;
        list = new ArrayList();
        result = new ArrayList();
        Arrays.sort(nums);
        helper(4,0,target);
        return result;
    }
    public void helper(int k, int start, long target){
        if(k != 2){
            for(int i = start; i<= nums.length - k;i++){
                if (i>start && nums[i] == nums[i-1]) continue;
                list.add(nums[i]);
                helper(k-1,i+1,target - nums[i]);
                list.removeLast();
            }
        }else{
            int l = start, r = nums.length-1;
            while(l<r){
                if(nums[l] + nums[r] > target) r--;
                else if ((long)(nums[l] + nums[r]) < target) l++;
                else{
                    List<Integer> temp = new ArrayList(list);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                    l++;
                    while(l<r && nums[l] == nums[l-1]) l++;
                }
            }
        }
        
    }
}
class Solution {
    public int minSubarray(int[] nums, int p) {
        Map<Integer, Integer> map = new HashMap();
        map.put(0,-1);
        int rem = 0; 
        for(int i : nums){
            rem=(rem+i)%p;
        }
        if(rem == 0) return 0;
        int a = 0;
        int res = nums.length;
        for(int i = 0; i< nums.length; i++){
            a =  (a + nums[i])%p;
            if(map.containsKey((a-rem+p)%p)){
                res = Math.min(res,i - map.get((a-rem+p)%p));
            }
            map.put(a,i);
        }
        if(res == nums.length) return -1;
        return res;
    }
}

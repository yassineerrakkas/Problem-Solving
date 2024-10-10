class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap();
        for(int i : nums){
            map.put(i,true);
        }
        int res = 0;
        for(int i: nums){
            if(!map.containsKey(i-1)){
                int k = 1;
                while(map.containsKey(i+k)){
                    k++;
                }
                res = Math.max(k,res);
            }
        }
        return res;
    }
}
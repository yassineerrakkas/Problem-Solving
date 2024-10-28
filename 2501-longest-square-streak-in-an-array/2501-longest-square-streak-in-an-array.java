class Solution {
    public int longestSquareStreak(int[] nums) {
        Map<Integer,Boolean> map = new HashMap();
        int res = -1;
        for(int num : nums){
            map.put(num,true);
        }
        int i = 0;
        for(int num : nums) {
            int count = 1;
            long temp = num;
            while(temp*temp < Integer.MAX_VALUE && map.containsKey((int)(temp*temp))) {
                count++;
                temp *= temp;
            }
            if(count != 0){
                res = Math.max(count, res);
            }
            i++;
        }
        return res == 1 ? -1 : res;
    }
}
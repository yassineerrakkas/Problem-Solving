class Solution {
    public int largestCombination(int[] candidates) {
        int res = 0;
        for(int i = 0; i < 24; i++){
            int count = 0;
            for(int j = 0; j < candidates.length; j++){
                if((candidates[j] & 1) == 1) count++;
                candidates[j] = candidates[j] >> 1;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
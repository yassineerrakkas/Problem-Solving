class Solution {
    public int rob(int[] nums) {
        int prevMax1 = 0, prevMax2 = 0;
        for(int i : nums){
            int temp = prevMax1;
            prevMax1 = Math.max(i+prevMax2,prevMax1);
            prevMax2 = temp;
        }
        return prevMax1;
    }
}
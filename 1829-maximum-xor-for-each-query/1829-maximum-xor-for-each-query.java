class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int [] xor = new int[n];
        xor[n-1] = nums[0];
        for(int i = 1; i < n; i++){
            xor[n-1-i] = xor[n-i] ^ nums[i];
        }
        int mask = (int)Math.pow(2,maximumBit) -1;
        for(int i = 0; i<n; i++){
            xor[i] = ~xor[i] & mask;
        }
        return xor;
    }
}
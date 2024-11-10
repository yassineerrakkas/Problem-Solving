class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if(k == 0) return 1;
        int[] bits = new int[32];
        int n = nums.length;
        int j = 0;
        int ans = n+1;
        for(int i = 0; i< n; i++){
            updateBits(bits,nums[i],1);
            while(j < n && k <= bitsToInt(bits)){
                ans = Math.min(ans, i-j+1);
                updateBits(bits,nums[j],-1);
                j++;
            }
        }
        return (ans > n) ? -1 : ans;
    }
    public int bitsToInt(int[] bits){
        int val = 0;
        for(int i = 0; i<32; i++){
            if(bits[i] != 0) val += (1<<i);
        }
        return val;
    }
    public void updateBits(int[] bits, int n, int val){
        for(int i = 0; i<32; i++){
            if( (n & (1<<i)) != 0) bits[i] +=val;
        }
    }
}
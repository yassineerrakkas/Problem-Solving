public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 1) return dividend;
        long ans;        
        ans = helper(Math.abs((long) dividend),Math.abs((long) divisor));
        if((divisor >= 0) == (dividend >= 0)) return (int) ans;
        return (int) (-ans);
    }
    public long helper(long a, long b){
        long result = 0;
        for (int i = 30; i >= 0; i--) {
            if (a >= (b << i)) {
                result += (1 << i);
                a -= (b << i);
            }
        }
        return result;
    }
}

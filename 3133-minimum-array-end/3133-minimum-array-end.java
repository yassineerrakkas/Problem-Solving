class Solution {
    public long minEnd(int n, int x) {
        n--;
        long res = x+n;
        while(((res) & x )!= x) {
            n = n << 1;
            res = x+n;
        }
        return x+n;
    }
}
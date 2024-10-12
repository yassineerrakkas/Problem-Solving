class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0 : return 0
        r, l = x, 0
        while(l<=r):
            m = l + (r-l)//2
            if(m * m == x): return m
            if(m * m < x): l = m+1
            else : r = m-1
        return r
        
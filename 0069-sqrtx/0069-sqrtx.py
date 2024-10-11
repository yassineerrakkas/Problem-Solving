class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 1 or x == 0 : return x
        if x == 2 : return 1
        for i in range(x):
            if( i*i > x) : return i-1
        return 0
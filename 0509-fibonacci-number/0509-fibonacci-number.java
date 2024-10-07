class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int f0 = 0;
        int f1 = 1;
        int i = 0;
        while(i<n-1){
            int temp = f1 + f0;
            f0 = f1;
            f1 = temp;
            i++;
        }
        return f1;
    }
}
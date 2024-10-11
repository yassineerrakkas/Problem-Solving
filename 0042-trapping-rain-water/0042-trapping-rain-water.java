class Solution {
    public int trap(int[] height) {
        int[] l = new int[height.length];
        int[] r = new int[height.length];
        int res = 0;
        r[height.length-1] = height[height.length-1];
        l[0] = height[0];
        for(int i = 1; i<height.length; i++){
            l[i] = Math.max(l[i-1], height[i]);
        }
        for(int i = height.length - 2; i>=0; i--){
            r[i] = Math.max(r[i+1], height[i]);
        }
        for(int i = 0; i<height.length;i++){
            int a = Math.min(r[i],l[i]) - height[i];
            if(a > 0) res+=a;
        }
        return res;
    }
}
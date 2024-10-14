class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack();
        int res = 0;
        for(int i = 0; i<heights.length; i++){
            int s = i;
            while(!stack.isEmpty() && stack.peek()[1] > heights[i]){
               int [] top = stack.pop();
               res = Math.max( res,top[1] * (i - top[0]) );
               s = top[0];
            }
            stack.push(new int[] {s,heights[i]});
        }
        while(!stack.isEmpty()){
            int [] top = stack.pop();
            res = Math.max(res, top[1]*(heights.length - top[0]) );
        }
        return res;
    }
}
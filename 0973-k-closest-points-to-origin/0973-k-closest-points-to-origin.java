class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(int i = 0; i<points.length; i++){
            maxHeap.add(new int[]{points[i][0]*points[i][0] + points[i][1]*points[i][1], i});
        }
        int[][] ans = new int[k][2];
        while(k > 0){
            ans[k-1] = points[maxHeap.poll()[1]];
            k--;
        }
        return ans;
    }
}
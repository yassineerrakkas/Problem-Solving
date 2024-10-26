class KthLargest {
    private PriorityQueue<Integer> pq;
    private int size;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue();
        size = k;
        for(int num : nums) add(num);
    }
    
    public int add(int val) {
        if(pq.size() < size || pq.peek() < val){
            pq.add(val);
            if(pq.size() > size) pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
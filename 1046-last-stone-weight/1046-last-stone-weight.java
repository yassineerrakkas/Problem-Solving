class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int stone: stones) pq.add(stone);
        while(pq.size() > 1){
            int newStone = pq.poll() - pq.poll();
            if(newStone != 0) pq.add(newStone);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            if(occ.containsKey(nums[i]))
                occ.put(nums[i], occ.get(nums[i]) +1);
            else occ.put(nums[i], 1);
        }
        Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer,Integer> element:occ.entrySet()){
            queue.add(element);
        }
        int[] res = new int[k];
        for(int i = 0 ; i<k; i++){
            res[i] = queue.poll().getKey();
        }
        return res;
    }
}
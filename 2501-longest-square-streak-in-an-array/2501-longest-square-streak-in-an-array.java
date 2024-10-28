class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num : nums) set.add(num);
        int res = -1;
        for(int num : nums){
            if (!set.contains(num / num) || num == 1) {
                int count = 1;
                int temp = num;
                while (true) {
                    long square = (long) temp * temp;
                    if (square > Integer.MAX_VALUE || !set.contains((int) square)) break;

                    count++;
                    temp = (int) square;
                }
                res = Math.max(res, count);
            }
        }
        return res == 1 ? -1 : res;
    }
}
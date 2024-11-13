class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));
        int[][] sortedQueries = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, Comparator.comparingInt(a -> a[0]));
        int[] ans = new int[queries.length];
        int maxBeauty = 0;
        int i = 0;
        for(int querie[] : sortedQueries){
            int q = querie[0];
            int index = querie[1];
            while(i < items.length && items[i][0] <= q){
                maxBeauty = Math.max(maxBeauty, items[i][1]);
                i++;
            }
            ans[index] = maxBeauty;
        }
        return ans;
    }
}
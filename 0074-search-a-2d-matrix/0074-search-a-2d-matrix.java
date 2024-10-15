class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++){
            if( search(matrix[i], target) != -1) return true;
        }
        return false;
    }
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l<=r){
            int m = l + (r-l)/2 ;
            if(nums[m] == target) return m;
            if(nums[m] < target) l = m+1;
            else r = m-1;
        }
        return -1;
    }
}
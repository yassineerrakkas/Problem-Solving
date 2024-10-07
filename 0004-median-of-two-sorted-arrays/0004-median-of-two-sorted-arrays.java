class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] mergedArr = new int[n+m];
        int i =0, j=0, k =0;

        while(i <n || j <m){
            if(i <n && j <m){
                if(nums1[i] < nums2[j]){
                    mergedArr[k] = nums1[i];
                    i++;
                    k++;
                }else{
                    mergedArr[k] = nums2[j];
                    j++;
                    k++;
                }
            }else if(i <n){
                mergedArr[k] = nums1[i];
                i++;
                k++;
            }else{
                mergedArr[k] = nums2[j];
                j++;
                k++;
            }
        }
        double res = 0;
        if((n+m)%2 == 0){
            res = ((double)mergedArr[(n+m)/2] + (double)mergedArr[((n+m)/2)-1])/2;
            return res;
        }
        res = (double)mergedArr[(n+m)/2];
        return res;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n = nums1.length + nums2.length;
        int arry[] = new int [n];

        for(int i = 0; i < nums1.length; i++){
            arry[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            arry[n1 + i] = nums2[i];
        }
       
        Arrays.sort(arry);

        if(n%2 == 1) return arry[n/2];
        else return (arry[n/2 - 1] + arry[n/2]) / 2.0;
    }
}
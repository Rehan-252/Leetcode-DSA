class Solution {
    public boolean searchMatrix(int[][] arry, int target) {
        int m = arry.length; // 3
        int n = arry[0].length; // 4

        int st = 0;
        int end = m * n - 1;

        while(st <= end){
            int mid = st + (end - st)/2;
            int midEle = arry[mid/n][mid%n];

            if(target == midEle) return true;
            else if(target < midEle) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }
}
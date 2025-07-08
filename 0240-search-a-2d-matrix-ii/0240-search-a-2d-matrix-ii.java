class Solution {
    public boolean searchMatrix(int[][] arry, int target) {
        int m = arry.length, n = arry[0].length;
        int i = 0, j = n - 1;

        while(i < m && j >= 0){

            if(target == arry[i][j]) return true;
            else if(target < arry[i][j]) j--;
            else i++;
        }
        return false;
    }
}
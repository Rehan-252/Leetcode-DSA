class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int max = 0;
        int left = 0, right = n;

        while(left < right){

            int area = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(area,max);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}
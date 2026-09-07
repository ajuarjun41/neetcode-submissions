class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int l = 0;
        int r = n - 1;

        while (r > l) {
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxArea = Math.max(area, maxArea);
            if (heights[r] > heights[l]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}

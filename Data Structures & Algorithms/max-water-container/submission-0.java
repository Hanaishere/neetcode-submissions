class Solution {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int area = 0 , length = 0;
        int l = 0 , r = heights.length-1;
        while(l < r)
        {
            length = Math.min(heights[l], heights[r]);
            area = length * (r-l);
            maxArea = Math.max(maxArea,area);
            if(heights[l] < heights[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}

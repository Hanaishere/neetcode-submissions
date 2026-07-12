class Solution {
    public int trap(int[] height) {
        int l = 0 , r = height.length-1;
        int leftHeight = height[l], rightHeight = height[r];
        int sum = 0;
        while(l < r)
        {
            if(leftHeight < rightHeight)
            {
                l++;
                leftHeight = Math.max(leftHeight , height[l]);
                sum += leftHeight - height[l];
            }
            else{
                r--;
                rightHeight = Math.max(rightHeight , height[r]);
                sum += rightHeight - height[r];
            }
        }
        return sum;
    }
}

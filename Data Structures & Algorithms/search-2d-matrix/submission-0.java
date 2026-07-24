class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m ;i++)
        {
            for(int j = 0 ; j < n;j++)
            {
                int l = i , r = n-1;
                while(l <= r)
                {
                    int mid = (l+r)/2;
                    if(matrix[i][mid] == target)
                    {
                          return true;
                    }
                    
                    else if(target < matrix[i][mid])
                    {
                        r = mid-1;
                    }
                    else{
                        l = mid+1;
                    }
                }
            }
        }
        return false;
    }
}

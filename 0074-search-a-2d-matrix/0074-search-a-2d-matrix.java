class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
   int m,n,low,high;
   m=matrix.length;
   n=matrix[0].length;
   low=0;
   high=m*n;
   while(low<high)
   {
   int mid=(low+high)/2;
   int i=mid/n;
   int j=mid%n;
    if(matrix[i][j]==target)
    {
        return true;
    }
   else if(matrix[i][j]<target)
  {
    low=mid+1;
  }
   else
  {
    high=mid;
  }


   }
return false;


    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int i,j,sum=0,n=mat.length;
        for(i=0;i<n;i++)
        {
           sum+=mat[i][i];
            sum+=mat[i][n-1-i];
        }
if(n%2!=0)
{
    sum=sum-mat[n/2][n/2];
    return sum;
}

        
return sum;



    }
}
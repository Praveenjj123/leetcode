class Solution {
    public boolean checkValid(int[][] matrix) {
        int i,j,n,k;
      n=matrix.length;
        int hp[]=new int[n+1];
     for(i=0;i<n;i++)
     {
        for(j=0;j<n;j++)
        {
            hp[matrix[i][j]]++;
        }
        for(k=0;k<n;k++)
        {
            if(hp[matrix[i][k]]!=1)
            {
                return false;
            }
            else 
            {
                hp[matrix[i][k]]=0;
            }
        }
     }
     for(i=0;i<n;i++)
     {
        for(j=0;j<n;j++)
        {
            hp[matrix[j][i]]++;
        }
        for(k=0;k<n;k++)
        {
            if(hp[matrix[i][k]]!=1)
            {
                return false;
            }
            else 
            {
                hp[matrix[i][k]]=0;
            }
        }
     }
     
     return true;
     

     }




    
}
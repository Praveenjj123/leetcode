class Solution {
    public void setZeroes(int[][] matrix) {
     HashSet<Integer> hs=new HashSet<>();
     HashSet<Integer> hs1=new HashSet<>();
     int i,j;
     for(i=0;i<matrix.length;i++)
     {
        for(j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0)
            {
                hs.add(i);
                hs1.add(j);
            }
        }
        }
      for(i=0;i<matrix.length;i++)
     {
        for(j=0;j<matrix[0].length;j++) 
        {
          if(hs.contains(i))
          {
            matrix[i][j]=0;
          }
          if(hs1.contains(j))
          {
             matrix[i][j]=0;
          }

        } 



     }
    }
    }

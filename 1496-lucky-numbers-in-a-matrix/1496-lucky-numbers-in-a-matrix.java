class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
 int i,j,r,c,k;
 int max=Integer.MIN_VALUE;
 int min=Integer.MAX_VALUE;
 r=matrix.length;
 c=matrix[0].length;
 List<Integer> list=new ArrayList<>();
 int[] one=new int[r];
 int[] two=new int[c];
 i=0;
 k=0;
 for(i=0;i<r;i++)
 {
    for(j=0;j<c;j++)
    {
       if(matrix[i][j]<min)
       {
           min=matrix[i][j];
       }
    }
    one[k++]=min;
    min=Integer.MAX_VALUE;
} 
k=0;

for(i=0;i<c;i++)
 {
    for(j=0;j<r;j++)
    {
       if(matrix[j][i]>max)
       {
           max=matrix[j][i];
       }
    }
    two[k++]=max;
    max=Integer.MIN_VALUE;
} 

for(i=0;i<r;i++)
 {
    for(j=0;j<c;j++)
    {    
if(one[i]==two[j])
{
    list.add(one[i]);
}
    }
}
return list;
    }
}
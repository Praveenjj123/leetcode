class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int br,tr,tc,bc,i,n,c=0;
        br=0;
        bc=0;
         tr=matrix.length-1;
         tc=matrix[0].length-1;
n=matrix.length*matrix[0].length;
         ArrayList<Integer> list=new ArrayList<>();
     while((br<=tr&&bc<=tc)&&c!=n)
   {
     for(i=bc;i<=tc&&c!=n;i++)
     {
       list.add(matrix[br][i]);
       c++;  
    }
    br++;
    
     for(i=br;i<=tr&&c!=n;i++)
     {
       list.add(matrix[i][tc]);  
       c++;
    }
       tc--;
      
      for(i=tc;i>=bc&&c!=n;i--)
     {
       list.add(matrix[tr][i]);  
       c++;
    } 
   tr--;
     for(i=tr;i>=br&&c!=n;i--)
     {
       list.add(matrix[i][bc]);  
       c++;
    } 
    bc++;

   }      
return list;
    }
}
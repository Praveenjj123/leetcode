class Solution {
    public int[][] generateMatrix(int n) {
int rowl,rowup,colup,collo,i;
rowl=0;
rowup=n-1;
colup=n-1;
int[][] matrix=new int[n][n];
collo=0;
int c=1;
int s=n*n;
while((rowl<=rowup&&collo<=colup)&&s>=c)
{
    for(i=collo;i<=colup&&s>=c;i++)
    {
        matrix[rowl][i]=c;
        c++;
    }
    rowl++;
    for(i=rowl;i<=rowup&&s>=c;i++)
    {
        matrix[i][colup]=c;
        c++;
    }
    colup--;

    for(i=colup;i>=collo&&s>=c;i--)
    {
        matrix[rowup][i]=c;
      
        c++;
    }
    rowup--;
    for(i=rowup;i>=rowl&&s>=c;i--)
    {
        matrix[i][collo]=c;
        c++;
    }
    collo++;
    

}
return matrix;




    }
}



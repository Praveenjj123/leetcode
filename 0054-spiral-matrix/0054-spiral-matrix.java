class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
ArrayList<Integer> al=new ArrayList<>();
int rowl,rowup,colup,collo,i;
rowl=0;
rowup=matrix.length-1;
colup=matrix[0].length-1;
collo=0;
int n=0;
int s=(matrix.length)*(matrix[0].length);
while((rowl<=rowup)&&(collo<=colup)&&s!=n)
{
    for(i=collo;i<=colup&&s!=n;i++)
    {
        al.add(matrix[rowl][i]);
        n++;
    }
    rowl++;
    for(i=rowl;i<=rowup&&s!=n;i++)
    {
        al.add(matrix[i][colup]);
        n++;
    }
    colup--;

    for(i=colup;i>=collo&&s!=n;i--)
    {
        al.add(matrix[rowup][i]);
        n++;
    }
    rowup--;
    for(i=rowup;i>=rowl&&s!=n;i--)
    {
        al.add(matrix[i][collo]);
        n++;
    }
    collo++;
    

}
return al;




    }
}
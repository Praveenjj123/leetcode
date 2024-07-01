class Solution {
    public int lengthOfLastWord(String s) {
char[] a=s.toCharArray();
int i=0,c=0;
for(i=s.length()-1;i>=0;i--)
{
     if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z'))
     {
        c++;
        
     }
     else if(a[i]==' '&&c>0)
     {
       break;
     }
}
return c;



        
    }
}
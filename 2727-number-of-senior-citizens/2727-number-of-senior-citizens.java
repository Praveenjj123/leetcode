class Solution {
    public int countSeniors(String[] details) {
      int i,n,m,c=0;
      char a,b;
      for(i=0;i<details.length;i++)
      {
            a=details[i].charAt(11);
            b=details[i].charAt(12);
            n=a-'0';
            m=b-'0';
          if(((n*10)+m)>60)
          {
            c++;
          }
      } 

return c;

    }
}
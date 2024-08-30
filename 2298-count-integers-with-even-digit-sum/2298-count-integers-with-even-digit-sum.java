class Solution {
    public int countEven(int num) {
        int i,temp,sum=0,c=0,in;
        for(i=2;i<=num;i++)
        {
           in=i;
           while(in>0)
           {
              temp=in%10;
               sum+=temp;
              in/=10;
              }
        if(sum%2==0)
        {
            c++;
        }
        sum=0;
        }

return c;
        
    }
}
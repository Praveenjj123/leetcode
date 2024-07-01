class Solution {
    public boolean isPalindrome(int x) {
        int temp,sum=0,temp2;
        temp2=x;
      if(x>=0)
      {
        while(x>0)
        {
           temp=x%10;
           sum=sum*10+temp;
           x=x/10;
           }
           if(temp2==sum)
           {
            return true;
           }
           else
           {
            return false;
           }
      }
      else
    {
        return false;
    }







    }
}

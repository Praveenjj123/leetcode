class Solution {
    public int[] plusOne(int[] digits) {
        int i;
        if(digits[digits.length-1]>=0&&digits[digits.length-1]<=8)
        {
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        else
        {
        int c=1;
        for(i=digits.length-1;i>=0;i--)
        {
            if(c==1)
            {
          if(digits[i]>8)
          {
            digits[i]=0;
            c=1;
            }
            else
            {
                digits[i]+=1;
                c=0;
            }
            }
            else
            {
                break;
            }
        }
        if(digits[0]==0)
        {
            int []a=new int[digits.length+1];
            a[0]=1;
            for(i=1;i<a.length-1;i++)
            {
                a[i]=digits[i-1];
            }
            return a;
        }



        }
        return digits;
    }
}
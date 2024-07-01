class Solution {
    public void sortColors(int[] nums) {
       int l=0,m=0,n=0,i;
       for(i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        l++;
        else if(nums[i]==1)
        m++;
        else
        n++;
        }
        i=0;
     while(l>0)
     {
        nums[i++]=0;
        l--;
     }
     while(m>0)
     {
        nums[i++]=1;
        m--;
     }
     while(n>0)
     {
        nums[i++]=2;
        n--;
     }

    }
}
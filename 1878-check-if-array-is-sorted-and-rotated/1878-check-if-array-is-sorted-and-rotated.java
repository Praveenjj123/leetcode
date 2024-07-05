class Solution {
    public boolean check(int[] nums) {
       
 int count=0,i;
for(i=0;i<nums.length-1;i++)
{
    if(nums[i+1]<nums[i])
    {
count++;
    }
}
if(nums[0]<nums[nums.length-1])
{
    count++;
}
return count<=1;
 
 
 




        



    }
}
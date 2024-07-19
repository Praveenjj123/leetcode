class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
      int i,c=0;
      HashMap<Integer,Integer> hm =new  HashMap<>();
      int[] a=new int[2];
      for(i=0;i<nums.length;i++)
      {
        int sum=target-nums[i];
        if(hm.containsKey(sum))
        {
            a[c++]=hm.get(sum);
            a[c]=i;
           return a;
        }
        else
        {
             hm.put(nums[i],i);
             
        }
}
    
return a;
    }
}
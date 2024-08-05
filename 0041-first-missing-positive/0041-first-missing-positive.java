class Solution {
    public int firstMissingPositive(int[] nums) {
      int i;
 HashSet<Integer> hs=new HashSet<>();
      for(i=0;i<nums.length;i++)
      {
        if(nums[i]>0)
        {
        hs.add(nums[i]);
        }
        }  
        i=1;
      while(hs.contains(i))
      {
        i++;
      }
      return i;
  }
}
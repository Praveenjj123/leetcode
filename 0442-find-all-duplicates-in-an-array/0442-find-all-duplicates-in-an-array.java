class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li=new ArrayList<>();
      for(int i:nums)
      {
        int index=Math.abs(i)-1;
        if(nums[index]<0)
        {
            li.add(Math.abs(i));
        }
        else
        {
            nums[index]=-nums[index];
        }
        
      }



return li;
        
    }
}
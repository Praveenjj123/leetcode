class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> li=new ArrayList<>();
    int i,j,k,sum;
    for(i=0;i<nums.length;i++)
    {
    if (i > 0 && nums[i] == nums[i - 1]) 
    {
        continue;
    }
    j=i+1;
    k=nums.length-1;
    while(j<k)
    {
    sum=nums[i]+nums[j]+nums[k];
    if(sum>0)
    {
        k--;
    }
    else if(sum<0)
    {
      j++;  
    }
    else
    {
      li.add(Arrays.asList(nums[i],nums[j],nums[k]));
     
      while(j<k && nums[j]==nums[j+1])
      {
        j++;
      }
      while(j<k && nums[k]==nums[k-1])
      {
        k--;
      }
       j++;
      k--;

    }


    }

    }
    

return li;




        
    }
}
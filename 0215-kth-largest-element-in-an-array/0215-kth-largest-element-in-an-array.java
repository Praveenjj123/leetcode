class Solution {
    public int findKthLargest(int[] nums, int k) 
    { 
     PriorityQueue<Integer> minh=new PriorityQueue<>();
     int i;
     for(i=0;i<nums.length;i++)
     {
        minh.add(nums[i]);
        if(minh.size()>k)
        {
            minh.poll();
        }
}

return minh.peek();


    }
}
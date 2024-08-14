class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int start=0;
        int end=len-1;
        int breadth=len-1;
        int area,hi,max=Integer.MIN_VALUE;
        while(start<end)
        {
             hi=Math.min(height[start],height[end]);
             area=hi*breadth;
             max=Math.max(max,area);
             if(height[start]<height[end])
             {
                start++;
                }
                else 
             {
                    end--;
            }
       breadth--;

}
   return max;










    }
}
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       int i;
       if(arr.length>=3)
       {
       for(i=0;i<arr.length-2;i++)
       {
        if(arr[i]%2!=0)
        {
         
           if((arr[i+1]%2!=0)&&(arr[i+2]%2!=0))
           {
                 return true;
           }
        }
       }
       }
       else
       {
        return false;
       }
       return false; 
    }
}
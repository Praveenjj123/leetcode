class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1,l2,l,i,j,n;
        double result;
        l1=nums1.length;
        l2=nums2.length;
        int[] a=new int[l1+l2];
       for(i=0;i<l1;i++)
       {
           a[i]=nums1[i];
       } 
       for(i=0;i<l2;i++)
       {
        a[l1+i]=nums2[i];
       }
      Arrays.sort(a);
    
      l=l1+l2;
     if(l%2!=0)
     {
        i=(l-1)/2;
        j=a[i];
       result=(double)j;
       return result;
     } 
     else
     {
        i=l/2;
        j=i-1;
      result=(double)((a[j]+a[i])/2.0);
       
       return result;
     }
    }
}
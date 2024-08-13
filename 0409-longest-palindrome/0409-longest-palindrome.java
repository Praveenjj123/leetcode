class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        int l=s.length(),i;
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int c=0;
        boolean tr=false;
        for (int freq : hm.values())
        {
            if(freq%2==0)
            {
                  c+=freq;
            }
            else
            {
                tr=true;
               c+=freq-1;
            }
         }
         if(tr)
         {
            return c+1;
         }
return c;
    }
}
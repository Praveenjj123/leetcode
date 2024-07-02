class Solution {
    public int firstUniqChar(String s) {
        int hash[]=new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
           hash[(s.charAt(i)-'a')]++;
        }
        for(i=0;i<s.length();i++)
        {
          if(hash[(s.charAt(i)-'a')]==1)
          {
             return i;
          }
    }
return -1;


    }
}
   
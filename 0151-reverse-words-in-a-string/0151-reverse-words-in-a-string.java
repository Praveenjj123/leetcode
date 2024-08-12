class Solution {
    public String reverseWords(String s) {
       int l= s.length();
       int i=0;
       String ans="";
       while(i<l)
       {
        String temp="";
        while(i<l&& s.charAt(i)==' ')
        {
            i++;
        }
        while(i<l &&s.charAt(i)!=' ')
        {
           temp+=s.charAt(i);
          i++;
        }
        if(temp.length()>0)
        {
        
            if(ans.length()==0)
            {
       ans+=temp; 
            }
            else
            {
                ans=temp+" "+ans;
            }
     }
       }


return ans;
    }
}
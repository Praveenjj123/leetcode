class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st=new Stack<>();
       int l,i;
       l=s.length();
  for(i=0;i<l;i++)
  {
     if(!st.isEmpty()&&(st.peek()==s.charAt(i)))
     {
        st.pop();
     }
     else
     {
        st.push(s.charAt(i));
     }
}   
    
StringBuilder s1=new StringBuilder();

for(Character c:st)
{
    s1.append(c);
}
return s1.toString();
}
}
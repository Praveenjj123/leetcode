class Solution {
    public void reverseString(char[] s) {
        int i,st,end;
        char temp;
st=0;
end=s.length-1;
while(st<end)
{
    temp=s[st];
    s[st]=s[end];
    s[end]=temp;
    st++;
    end--;
}




    }
}
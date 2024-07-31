class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String> list=new ArrayList<>();
       generate(0,0,n,"",list);
       return list;
    }
    public static void generate(int open,int close,int n,String pr,ArrayList<String> list)
    {
        if(pr.length()==2*n)
        {
            list.add(pr);
            return;
        }
       if(open<n)
       {
        generate(open+1,close,n,pr+"(",list);
       }
       if(close<open)
       {
         generate(open,close+1,n,pr+")",list);
       }



    }

}
    

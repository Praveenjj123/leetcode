class Solution {
    public String frequencySort(String s) {
            HashMap<Character,Integer>hp=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
            }
          ArrayList<int []> temp=new ArrayList<>();
          for(Map.Entry<Character,Integer>x:hp.entrySet())
          {
            temp.add(new int[]{x.getValue(),x.getKey()});
          }
          Collections.sort(temp,(p,q)->p[0]!=q[0]?p[0]-q[0]:p[1]-q[1]);
          String ans="";
          for(int i=0;i<temp.size();i++)
          {
            int z[]=temp.get(i);
            int count=z[0];
            while(count!=0)
            {
                ans+=(char) z[1];
                count--;
            }

          }
          String final1="";
          for(int i=ans.length()-1;i>=0;i--)
          {
            final1+=ans.charAt(i);
          }
          return final1;
       }
}
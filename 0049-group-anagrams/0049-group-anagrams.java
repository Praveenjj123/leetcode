class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> li=new   HashMap<>();
       List<List<String>> ans=new ArrayList<>();
       int i,l=strs.length;
       for(i=0;i<l;i++)
       {
            String temp=strs[i];
             char[] arr=strs[i].toCharArray();
           Arrays.sort(arr);
              String star = new String(arr);
            if (!li.containsKey(star)) 
            {
          li.put(star,new ArrayList<>());
            }
          li.get(star).add(temp);

     }
     for(Map.Entry<String,List<String>> mapElement : li.entrySet())
     {
   ans.add(mapElement.getValue());
   }


return ans;





        
    }
}
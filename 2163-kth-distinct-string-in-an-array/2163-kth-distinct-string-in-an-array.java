class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        int i,c=0;
        for(i=0;i<arr.length;i++)
        {
          if(hm.containsKey(arr[i]))
          {
            hm.put(arr[i],hm.get(arr[i])+1);
          }
          else
          {
            hm.put(arr[i],1);
          }
        }
        for(i=0;i<arr.length;i++)
        {
            if(hm.get(arr[i])==1)
            {
                c++;
                if(c==k)
                {
                    return arr[i];
                }
            }
        }
return "";




    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> mp=new PriorityQueue<>(Collections.reverseOrder());
     int i,x,y;
     for(i=0;i<stones.length;i++)
     {
        mp.add(stones[i]);
     }
     while(mp.size()>1)
     {
         x=mp.poll();
         y=mp.poll();
         if(x!=y)
         {
            mp.add(x-y);
         }
     }
    if(mp.isEmpty())
    {
        return 0;
    }
else
{
    return mp.peek();
}

        
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fi=0,te=0,i;
   for(i=0;i<bills.length;i++)
   {
      if(bills[i]==5)
      {
        fi++;
      }
      else if(bills[i]==10)
      {
        if(fi>0)
        {
           te++;
           fi--;
        }
        else
        {
            return false;
        }
      }
        else
        {
            if(te>0&&fi>0)
            {
                te--;
                fi--;
            }
            else if(fi>=3)
            {
                   fi-=3;
            }
                else
                {
                    return false;
                }
            }
            
        } 
       
return true;
}



   }


    

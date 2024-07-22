/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Solution 
 {
 public ListNode reverse(ListNode head)
 {
     ListNode prev=null;
     ListNode forw=null;
     ListNode cur=head;
     while(cur!=null)
     {
        forw=cur.next;
        cur.next=prev;
        prev=cur;
        cur=forw;

     }
return prev;

}

    public boolean isPalindrome(ListNode head) {
        ListNode cur=head;
        ListNode slow=head;
        ListNode fast=head;
        int c=0,temp;
     while(fast!=null&&fast.next!=null)
     {
        fast=fast.next.next;
        slow=slow.next;
       }
  ListNode rever=reverse(slow); 

  while(rever!=null)
  {
  if(rever.val!=head.val)
  {
    return false;
  }
head=head.next;
rever=rever.next;
} 

return true;


        
    }
}
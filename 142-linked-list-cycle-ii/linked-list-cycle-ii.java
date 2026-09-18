/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode i=head;
         ListNode j=head;

       while(j!=null && j.next!=null){
        i=i.next;
        j=j.next.next;

        if (i==j){
            break;   
        }
       }  
       if (j==null || j.next==null) {
        return null;
       } 
       ListNode n1=head;
       ListNode n2=i;  

       while(n1!=n2){
        n1=n1.next;
        n2=n2.next;
       }
       return n1 ;   
    }
}
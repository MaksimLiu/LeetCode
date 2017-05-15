/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode prev=head;
        
        if(prev==null){
            return null;
        }
        
        while(prev.next!=null){
            
            if(prev.next.val==val){
                prev.next=prev.next.next;
            }else{
                prev=prev.next;
            }
        }
        
        return head.val==val?head.next:head;
        
    }
}
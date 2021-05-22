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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        
        ListNode ptr = new ListNode(0);
        ptr.next = head;
        ListNode ptr1=ptr,ptr2=ptr;
        int i = 0;
        
        while(ptr1!=null){
            if(i <= n){
                ptr1 = ptr1.next;
                i++;
                continue;
            }
            
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        ptr2.next = ptr2.next.next;
        return ptr.next;
    }
}
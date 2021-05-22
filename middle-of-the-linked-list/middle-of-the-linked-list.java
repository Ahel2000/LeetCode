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
    public ListNode middleNode(ListNode head) {
        if(head == null)return null;
        if(head.next == null)return head;
        if(head.next.next == null)return head.next;
        
        ListNode ptr = new ListNode(0);
        ptr.next = head;
        ListNode ptr1 = ptr,ptr2 = ptr;
        int i = 0;
        
        while(ptr2 != null && ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            i++;
        }
        
        if(ptr2!=null)return ptr1.next;
        return ptr1;
    }
}
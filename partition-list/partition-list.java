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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(-1);
        ListNode more = new ListNode(-1);
        ListNode x1 = less;
        ListNode x2 = more;
        
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                x1.next = new ListNode(curr.val);
                x1 = x1.next;
            }else{
                x2.next = new ListNode(curr.val);
                x2 = x2.next;
            }
            
            curr = curr.next;
        }
        
        x1.next = more.next;
        return less.next;
        
    }
}
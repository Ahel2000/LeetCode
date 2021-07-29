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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ListNode x = new ListNode(-1);
        x.next = head;
        ListNode prev = x;
        
        while(curr != null && curr.next != null){
            if(curr.val > curr.next.val){
                ListNode temp = curr.next;
                while(prev.next != null && prev.next.val < curr.next.val)prev = prev.next;
                curr.next = curr.next.next;
                temp.next = prev.next;
                prev.next = temp;
                prev = x;
            }else{
                curr = curr.next;
            }
        }
        
        return x.next;
    }
}
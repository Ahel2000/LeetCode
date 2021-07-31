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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0,n = 0;
        ListNode curr = head;
        
        while(curr != null){
            curr = curr.next;
            n++;
        }
        
        if(n == 0)return head;
        int net = k % n;
        if(net == 0)return head;
        
        count = n - net - 1;
        ListNode itr = head;
        while(count > 0 ){
            itr = itr.next;
            count--;
        }
        
        ListNode temp = itr;
        curr = itr;
        while(curr.next != null)curr = curr.next;
        curr.next = head;
        head = itr.next;
        itr.next = null;
        
        
        
        return head;
    }
}
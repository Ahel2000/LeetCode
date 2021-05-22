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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode p=l1,q=l2,curr=result;
        int carry=0;
        
        while(p!=null || q!=null){
            int x = (p==null)?0:p.val;
            int y = (q==null)?0:q.val;
            
            int sum = x + y + carry;
            int t = sum%10;
            carry = sum/10;
            
            ListNode l = new ListNode(t);
            curr.next = l;
            curr = curr.next;
            if(p!=null)p = p.next;
            if(q!=null)q = q.next;
        }
        
        if(carry > 0)curr.next = new ListNode(carry);
        return result.next;
    }
}
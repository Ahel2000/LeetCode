/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        while(!s.isEmpty()){
            if(head.val!=s.pop().val)return false;
            head=head.next;
        }
        return true;
    }
}

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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        int M = 1000000;
        while(temp!=null){
            if(temp.val == M)return true;
            temp.val = M; 
            temp = temp.next;
        }
        
        return false;
    }
}
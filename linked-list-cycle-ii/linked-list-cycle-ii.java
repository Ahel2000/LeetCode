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
        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();
        while(curr != null){
            if(!set.contains(curr)){
                set.add(curr);
            }else{
                return curr;
            }
            
            curr = curr.next;
        }
        
        return null;
    }
}
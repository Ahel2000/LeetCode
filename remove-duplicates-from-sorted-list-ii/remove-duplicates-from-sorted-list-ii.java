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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        ListNode curr = head;
        while(curr != null){
            if(map.containsKey(curr.val)){
                map.put(curr.val,map.get(curr.val) + 1);
            }else{
                map.put(curr.val,1);
            }
            
            curr = curr.next;
        }
        
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode prev = res;
        curr = head;
        while(curr != null){
            if(map.get(curr.val) > 1){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        
        return res.next;
    }
}
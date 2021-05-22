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
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        ListNode ptr = head;
        String s = "";
        while(ptr!=null){
            s = s + String.valueOf(ptr.val);
            ptr = ptr.next;
        }
        
        int x = 1;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i)=='1')decimal = decimal + x;
            x = x*2;
        }
        
        return decimal;
    }
}
// Last updated: 7/14/2026, 2:11:44 PM
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
        StringBuilder sb = new StringBuilder();

while(head != null){
    sb.append(head.val);   // val is 0 or 1
    head = head.next;
}

int result = Integer.parseInt(sb.toString(), 2);
        return result;
        
    }
}
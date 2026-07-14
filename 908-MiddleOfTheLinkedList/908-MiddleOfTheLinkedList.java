// Last updated: 7/14/2026, 2:12:17 PM
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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        if(head==null){
            return head;
        }
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1){
            return head;
        }
        int middle=count/2;
        ListNode temp1=head;
        for(int i=1;i<middle;i++){
            temp1=temp1.next;
        }
        ListNode newhead=temp1.next;
        temp1.next=null;
        head=newhead;
        return head;
    }
}
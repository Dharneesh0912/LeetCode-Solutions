// Last updated: 7/14/2026, 2:11:07 PM
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            head=null;
        }
        if(head==null){
            return head;
        }
        if(head.next.next==null){
            head.next=null;
        }
        ListNode temp=head;
        ListNode temp1=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=count/2;
        int count1=0;
        while(temp1.next!=null){
            count1++;
            if(count1==mid){
                temp1.next=temp1.next.next;

            }
            temp1=temp1.next;
        }

        return head;
    
        
    }
}
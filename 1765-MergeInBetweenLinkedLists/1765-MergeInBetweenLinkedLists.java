// Last updated: 7/14/2026, 2:11:26 PM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null){
            return list2;
        }
        ListNode dummy=list1;
        for(int i=0;i<b;i++){
            dummy=dummy.next;
        }
        ListNode connection=dummy.next;
        ListNode temp=list1;
        int count=0;
        for(int i=0;i<a-1;i++){
            temp=temp.next;
        }
        temp.next=list2;
        ListNode temp1=list1;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=connection;
        return list1;



        
    }
}
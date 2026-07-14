// Last updated: 7/14/2026, 2:15:32 PM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2; 
        if (list2 == null) return list1; 
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=temp2;
        List<Integer> values = new ArrayList<>();
        ListNode temp = list1;
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(values);
        temp = list1;
        for (int val : values) {
            temp.val = val;
            temp = temp.next;
        }
        return list1;

    }
}
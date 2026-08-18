// Last updated: 8/18/2026, 9:44:28 AM
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
    public void reorderList(ListNode head) {
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        ArrayList<ListNode> n=new ArrayList<>();
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            n.add(arr.get(i));
            n.add(arr.get(j));
            i++;
            j--;
        }
        if(i==j){
            n.add(arr.get(i));
        }
        for (ListNode node : n) {
            node.next = null;
        }
        ListNode temp2=head;
        for(int k=1;k<n.size();k++){
            temp2.next=n.get(k);
            temp2=temp2.next;
        }
    }
}
// Last updated: 7/14/2026, 2:14:38 PM
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
        HashSet<ListNode> map=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(!map.contains(temp)){
                map.add(temp);
                temp=temp.next;
            }
            else{
                return true;
            }

        }
        return false;
    }
}
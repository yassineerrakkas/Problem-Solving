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
        List<ListNode> refs = new ArrayList();
        ListNode temp = head;
        while(temp != null){
            refs.add(temp);
            temp = temp.next;
        }
        int l = 0, r = refs.size()-1;
        while(l<r){
            refs.get(l++).next = refs.get(r);
            refs.get(r--).next = refs.get(l);
        }
        refs.get(l).next = null;
    }
}
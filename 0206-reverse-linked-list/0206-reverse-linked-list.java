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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode temp = null;
        ListNode newNext = null;
        while(current != null){
            temp = current.next;
            current.next = newNext;
            newNext = current;
            current = temp;
        }
        return newNext;
    }
}
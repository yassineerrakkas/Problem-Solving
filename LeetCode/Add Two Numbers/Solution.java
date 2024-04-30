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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode l3 = head;
        ListNode res = new ListNode();
        int rest = 0;
        while(l1 != null || l2 != null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int val = (val1 + val2 + rest)%10;
            rest = (val1 + val2 + rest)/10;
            ListNode node = new ListNode(val);
            l3.next = node;
            l3 = l3.next;
            if (l1!= null) l1 = l1.next;
            if (l2!= null) l2 = l2.next;

        }
        if(rest > 0){
            ListNode node = new ListNode(rest);
            l3.next = node;
            l3 = l3.next;
        }
        return head.next;

    }

}
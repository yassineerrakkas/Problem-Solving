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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val -  b.val);
        for(ListNode list : lists){
            ListNode temp = list;
            while(temp != null) {
                queue.add(temp);
                temp = temp.next;
            }
        }
        ListNode head = queue.poll();
        ListNode temp1 = head;
        while(!queue.isEmpty()){
            ListNode temp2 = queue.poll();
            temp1.next = temp2;
            temp1 = temp2;
        }
        if(temp1 != null) temp1.next = null;
        return head;
    }
}
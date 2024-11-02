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
    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
       ListNode dummy = new ListNode(-1); 
       ListNode res = dummy; 

        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                res.next = new ListNode(list2.val); 
                list2 = list2.next;
            } else {
                res.next = new ListNode(list1.val); 
                list1 = list1.next;
            }
            res = res.next;
        }

        res.next = (list1 != null) ? list1 : list2; 
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        if(size == 0) return null; 
        if(size == 1) return lists[0]; 

        int middle = size / 2;
        ListNode left = mergeKLists(Arrays.copyOfRange(lists, 0, middle)); 
        ListNode right = mergeKLists(Arrays.copyOfRange(lists, middle, size)); 
        return mergeTwoList(left, right);
    }
}
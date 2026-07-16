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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;
        ListNode head2 = current;
        int size = 0;
        while(current!=null && current.next !=null){
            size++;
            prev.next = current.next;
            prev = current;
            current = current.next;
        }
        if(size%2==1){
            current.next = head2;
            prev.next = null;
        } else {
            prev.next = head2;
        }
        return head;
    }
}
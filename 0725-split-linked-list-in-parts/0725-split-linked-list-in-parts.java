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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        ListNode[] arr = new ListNode[k];
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int n = size/k;
        int r = size%k;
        temp = head;
        ListNode prev = null;
        for(int i=0; i<k && temp!=null; i++, r--){
            arr[i] = temp;
            for(int j=0; j<n+(r>0 ? 1:0); j++){
                prev = temp;
                temp = temp.next;
            }
            if(prev!=null){
                prev.next = null;
            }
        }
        return arr;
    }
}
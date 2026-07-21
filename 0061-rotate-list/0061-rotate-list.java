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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode a = head;
        int n = 0;
        while(a!=null){
            a=a.next;
            n++;
        }
        a=head;
        int[] arr = new int[n];
        n=0;
        while(a!=null){
            arr[n++] = a.val;
            a=a.next;
        }

        k=k%arr.length;
        int[] rotate = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rotate[(i+k)%arr.length] = arr[i];
        }
        
        ListNode dummy = new ListNode(rotate[0]);
        ListNode b = dummy;
        for(int i=1; i<rotate.length; i++){
            b.next = new ListNode(rotate[i]);
            b=b.next;
        }
        return dummy;
    }
}
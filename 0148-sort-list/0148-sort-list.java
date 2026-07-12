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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        int size = 0;
        ListNode a = head;
        while(a!=null){
            a=a.next;
            size++;
        }
        int[] arr = new int[size];
        int ind = 0;
        ListNode temp = head;
        while(temp!=null){
            arr[ind++] = temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
        ListNode ans = head;
        int it = 0;
        while(ans!=null){
            ans.val = arr[it++];
            ans=ans.next;
        }
        return head;
    }
}
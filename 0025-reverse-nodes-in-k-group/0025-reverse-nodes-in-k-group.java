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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int size = 0;
        ListNode a = head;
        while(a!=null){
            size++;
            a=a.next;
        }
        int[] arr = new int[size];
        ListNode b = head;
        int ind = 0;
        while(b!=null){
            arr[ind++] = b.val;
            b=b.next;
        }
        int it = 0;
        while(it<=size-k){
            reverse(arr,it,it+k-1);
            it=it+k;
        }
        ListNode ans = head;
        for(int x : arr){
            ans.val = x;
            ans=ans.next;
        }
        return head;
    }
    private void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        int size=0;
        ListNode a = head;
        while(a!=null){
            a=a.next;
            size++;
        }
        int[] arr = new int[size];
        ListNode b = head;
        int ind = 0;
        while(b!=null){
            arr[ind++] = b.val;
            b=b.next;
        }
        return pal(arr);
    }
    private boolean pal(int[] arr){
        int left = 0;
        int right =arr.length-1;
        while(left<=right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
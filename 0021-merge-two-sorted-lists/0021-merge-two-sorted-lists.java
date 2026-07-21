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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        int n = 0;
        int m = 0;
        ListNode a = list1;
        ListNode b = list2;
        while(a!=null){
            a=a.next;
            n++;
        }
        while(b!=null){
            b=b.next;
            n++;
        }
        int[] arr = new int[n];
        int ind = 0;
        a=list1;
        b=list2;
        while(a!=null){
            arr[ind++] = a.val;
            a=a.next;
        }
        while(b!=null){
            arr[ind++] = b.val;
            b=b.next;
        }
        Arrays.sort(arr);
        ListNode dummy = new ListNode(arr[0]);
        ListNode res = dummy;
        for(int i=1; i<arr.length; i++){
            res.next = new ListNode(arr[i]);
            res=res.next;
        }
        return dummy;
    }
}
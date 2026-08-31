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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp = head;
        int[] arr = new int[size];
        int ind = 0;
        while(temp!=null){
            arr[ind++] = temp.val;
            temp = temp.next;
        
        }
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int prev = 0;
        int start = 0;
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=1; i<size-1; i++){
            if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                ll.add(i);
            }
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                ll.add(i);
            }
        }
        if(ll.size()<=1){
            return res;
        }
        res[1] = ll.get(ll.size()-1)-ll.get(0);
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<ll.size(); i++){
            int t = ll.get(i)-ll.get(i-1);
            ans = Math.min(ans,t);
        }
        res[0] = ans;
        return res;
    }
}
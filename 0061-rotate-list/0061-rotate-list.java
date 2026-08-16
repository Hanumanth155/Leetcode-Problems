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
        ListNode l = head;
        if(head==null){
            return head;
        }
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head = head.next;
        }
        int n = a.size();
        if(k>=n){
            k = k%n;
        }
        reverseArray(a,0,(n-1));
        reverseArray(a,0,(k-1));
        reverseArray(a,k,(n-1));

        head=l;
        for(int i : a){
            head.val = i;
            head = head.next;
        }
        head=l;
        return head;
    }
    public static void reverseArray(ArrayList<Integer> a,int i,int j){
        while(i<j){
            int temp = a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
    }
}
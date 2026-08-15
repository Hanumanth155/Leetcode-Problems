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
    public ListNode reverseList(ListNode head) {
        ListNode l = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head = head.next;
        }
        int i=0;
        int j=a.size()-1;
        while(i<j){
            int temp = a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
        head=l;
        for(int x : a){
            head.val = x;
            head=head.next;
        }
        head=l;
        return head;
    }
}
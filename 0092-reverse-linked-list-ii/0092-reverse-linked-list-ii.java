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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l = head;
        ArrayList<Integer> a = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        left=left-1;
        right=right-1;
        while(left<right){
            int temp=a.get(left);
            a.set(left,a.get(right));
            a.set(right,temp);
            left++;
            right--;
        }
        head=l;
        for(int i : a){
            head.val = i;
            head=head.next;
        }
        head=l;
        return head;
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l = head;
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        while(head!=null){
            s.add(head.val);
            head = head.next;
        }
        ListNode root = null;
        head =  null;
        for(int i : s){
            ListNode temp = new ListNode(i);
            if(root==null){
                root = temp;
                head = temp;
            }else{
                root.next = temp;
                root = root.next;
            }
        }
    return head;
    }
}
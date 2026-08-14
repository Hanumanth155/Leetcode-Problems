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
    public ListNode middleNode(ListNode head) {
        ListNode l = head;
        int length=0;
        while(head!=null){
            length++;
            head = head.next;
        }
        int mid = (length/2)+1;
        int count=0;
        head=l;
        while(head!=null){
            count++;
            if(count==mid){
                return head;
            }
            head = head.next;
        }
        return head;
    }
}
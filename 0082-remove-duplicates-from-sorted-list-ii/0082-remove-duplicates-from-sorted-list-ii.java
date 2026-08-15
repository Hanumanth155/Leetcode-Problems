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
        LinkedHashMap<Integer,Integer> h = new LinkedHashMap<>();
        while(head!=null){
            h.put(head.val,h.getOrDefault(head.val,0)+1);
            head= head.next;
        }
        System.out.println(h);
        ListNode root = null;
        head = null;
        for(int i : h.keySet()){
            if(h.get(i)==1){
                 System.out.print(i+ " ");
                ListNode temp = new ListNode(i);
                if(root == null){
                    root=temp;
                    head =temp;
                }else{
                    root.next=temp;
                    root = root.next;
                }
            }
        }
        return head;
    }
}
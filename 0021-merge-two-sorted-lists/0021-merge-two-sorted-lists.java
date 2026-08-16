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
        ListNode l1 = list1;
        ListNode l2 = list2;
        ArrayList<Integer> a = new ArrayList<>();
        if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                a.add(list1.val);
                list1  = list1.next;
            }else{
                a.add(list2.val);
                list2 = list2.next;
            }
        }
        while(list1!=null){
            a.add(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            a.add(list2.val);
            list2 = list2.next;
        }
        ListNode root = null;
        ListNode head = null;
        for(int i : a){
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
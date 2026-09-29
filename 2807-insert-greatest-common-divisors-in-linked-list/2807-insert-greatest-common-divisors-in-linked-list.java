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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode l = head;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }if(a.size()==1){
            return l;
        }
        for(int i=1;i<a.size();i++){
            int num = gcd(a.get(i-1),a.get(i));
            res.add(a.get(i-1));
            res.add(num);
        }
        res.add(a.get(a.size()-1));
        ListNode root = null;
        head = null;
        for(int i:res){
            ListNode temp= new ListNode(i);
            if(root==null){
                root = temp;
                head = temp;
            }else{
                root.next=temp;
                root = root.next;
            }
        }

        return head;
    }
    public static int gcd(int a, int b){
        int gcd = 1;
        int lower=a;
        if(b<a){
            lower = b;
        }
        for(int i=2;i<=lower;i++){
            if((a%i==0)&&(b%i==0)){
                gcd=i;
            }
        }
        return gcd;
    }
}
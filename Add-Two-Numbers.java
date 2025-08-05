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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        int c=0;
        ListNode ans=new ListNode(0);
        ListNode res=ans;
        while(t1 != null || t2 != null || c!=0){
            int a=(t1 != null)?t1.val:0;
            int b=(t2 != null)?t2.val:0;
            ans.next=new ListNode(((a+b+c)%10));
            c=(int)(a+b+c)/10;
            ans=ans.next;
            if(t1!=null)t1=t1.next;
            if(t2!=null)t2=t2.next;
        }
        return res.next;
    }
}
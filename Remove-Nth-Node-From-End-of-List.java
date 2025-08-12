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
    public int len(ListNode head){
        int l=1;
        while(head!=null){
            l++;
            head=head.next;
        }
        return l;
    }
    public ListNode rem(ListNode root,int l){
        int cur=1;
        ListNode head=root;
        while(head != null &&l!=cur){
            cur++;
            head=head.next;
        }
        if(head!=null){
            if(head.next!=null){
                help(head.next,head);
            }
        }
        return root;
    }
    public void help(ListNode head,ListNode pre){
        if(head.next!=null){
            pre.next=head.next;
        }
        else{
            pre.next=null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int tl=len(head);
        int nl=tl-n;
        if(nl==1){
            return head.next;
        }
        ListNode ans=rem(head,nl-1);
        return ans;
    }
}
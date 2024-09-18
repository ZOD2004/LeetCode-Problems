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
    public int le(ListNode head){
        int l=0;
        while(head != null){
            l++;
            head=head.next;
        }
        return l;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=le(head);
        ListNode ans[]=new ListNode [k];
        int a[]=new int[k];
        int g=0;
        while(len !=0){
            a[g%k]+=1;
            g++;
            len--;
        }
        ListNode dum;
        for(int i=0;i<k;i++){
            ListNode temp=head;
            if(a[i]==0){
                break;
            }
            while(temp.next!=null && a[i] >1){
                temp=temp.next;
                a[i]--;
            }
            dum=temp.next;
            temp.next=null;
            ans[i]= head;
            head=dum;
        }
        return ans;
    }
}
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp;
        temp=list1;
        b-=a;
        while(a>1){
            a--;
            temp=temp.next;
        }
        // System.out.println(temp.val);
        ListNode t1=temp.next;
        temp.next=list2;
        while(b>0){
            b--;
            t1=t1.next;
        }
        // System.out.println(t1.val);
        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        // System.out.println(temp.val);
        temp.next=t1.next;
        return list1;
    }
}
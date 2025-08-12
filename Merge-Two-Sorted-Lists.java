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
    public ListNode head;
    public ListNode tail;
    public void insert(int val){
        ListNode nn=new ListNode(val);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=tail.next;
        }
    }
    public void i(ListNode x){
        if(head==null){
            head = x;
        }
        else {
            tail.next=x;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1 != null || list2 !=null){

            if(list1==null){
            // return list2;
            i(list2);
            return head;
        }
        if(list2==null){
            // return list1;
            i(list1);
            return head;
        }
        if(list1.val<list2.val){
            insert(list1.val);
            list1=list1.next;
        }
        else{
            insert(list2.val);
            list2=list2.next;
        }
        }
        // System.gc();
    return head;    
    }
}
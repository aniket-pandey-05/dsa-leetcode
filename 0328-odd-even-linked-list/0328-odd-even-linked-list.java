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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode even = head.next;
        ListNode odd = head;
        ListNode even1 = head.next;
        while(odd != null){
            if(even1.next != null){
                odd.next = even1.next;
                odd = odd.next;
                if(odd.next != null){
                    even1.next = odd.next;
                    even1 = even1.next;
                }
                else{
                    even1.next = null;
                    odd.next = even;
                    even1 = null;
                    odd = null;
                }
            }
            else{
                even1.next = null;
                odd.next = even;
                even1 = null;
                odd = null;
            }
        }
        even = null;
        return head;
    }
}
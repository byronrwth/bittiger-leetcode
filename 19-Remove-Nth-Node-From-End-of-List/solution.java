/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 用 快慢 指针，快node指针在慢node指针前n个，快慢同时往队尾走，这样当快node到了队尾，慢node就到了该删的node
        ListNode dummyhead = new ListNode(-1);
        ListNode slow= dummyhead, fast = dummyhead ;
        dummyhead.next = head;
        int i = 0 ;
        for ( ; i < n ; i++ ) {
            fast = fast.next ;
        }
        
        while( fast.next != null) {
            fast = fast.next ;
            slow = slow.next ;
        }
        
        //fast.next is end, now delete slow.next 
        ListNode temp = slow.next.next;
        slow.next = temp ;
        
        return dummyhead.next;
    }
}
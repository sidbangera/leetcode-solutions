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
        ListNode digit1 = l1,digit2=l2;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(digit1 != null || digit2 != null || carry != 0){
            int x = (digit1 != null)?(digit1.val):0;
            int y = (digit2 != null)?(digit2.val):0;
            int sum = x+y+carry;
            int digit = sum%10;
            carry = sum/10;
            if(digit1 != null) digit1 = digit1.next;
            if(digit2 != null) digit2 = digit2.next;
            ListNode newNode = new ListNode(digit);
            temp.next = newNode;
            temp = temp.next;
        }
        return dummy.next;
    }
}
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode revHead = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = revHead;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            revHead = prev;
        }

        ListNode temp = head;
        ListNode temp2 = revHead;        

        while(revHead != null){
            revHead = temp2.next;
            temp2.next = temp.next;
            temp.next = temp2;
            temp2 = revHead;
            temp = temp.next.next;
        }
        temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        System.out.print(list);
    }
}
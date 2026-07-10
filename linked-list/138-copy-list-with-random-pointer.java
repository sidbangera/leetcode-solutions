/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node temp = head;
        Node dummy = new Node(0);
        Node temp2 = dummy;
        HashMap<Node,Node> map = new HashMap<>();

        while(temp != null){
            Node newNode = new Node(temp.val);
            temp2.next = newNode;
            temp2 = temp2.next;
            map.put(temp,temp2);
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);
            temp = temp.next;
        }
        return dummy.next;
    }
}
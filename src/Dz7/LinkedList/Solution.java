package Dz7.LinkedList;

public  class Solution {
    public static ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;

    }

    public static void main(String[] args) {
        ListNode y3 = new ListNode(3);
        y3.next = new ListNode(4);

        ListNode y2 = new ListNode(2);
        y2.next = y3;

        ListNode x1 = new ListNode(1);
        x1.next = y2;
        ListNode z = swapPairs(x1);
        while (z != null){
            System.out.println(z.val);
            z = z.next;
        }

    }
}

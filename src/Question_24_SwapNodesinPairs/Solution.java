package Question_24_SwapNodesinPairs;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int temp;
        temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        head.next.next = swapPairs(head.next.next);
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
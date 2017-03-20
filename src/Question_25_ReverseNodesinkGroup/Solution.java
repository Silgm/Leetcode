package Question_25_ReverseNodesinkGroup;


public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 0) {
            return head;
        }
        ListNode x;
        ListNode node = head;
        int i = 0;
        for (; i < k && node != null; i++, node = node.next) ;
        if (i == k) {
            int[] a = new int[k];
            int pos = 0;
            x= head;
            for (; x.next != node; x = x.next) {
                a[pos++] = x.val;
            }
            a[pos] = x.val;
            for (int m = 0, n = k - 1; m < n; m++, n--) {
                int temp = a[m];
                a[m] = a[n];
                a[n] = temp;
            }
            x = head;
            pos = 0;
            for (; x.next != node; x = x.next) {
                x.val=a[pos++];
            }
            x.val=a[pos];
        } else {
            return head;
        }
        x.next=reverseKGroup(node,k);
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
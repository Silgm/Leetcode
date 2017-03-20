package Question_2_AddTwoNumbers;
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode x;
        ListNode y;
        for (x = l1, y = l2; x != null && y != null; x = x.next, y = y.next) {
            int value = x.val + y.val;
            x.val = value;
            y.val = value;
        }
        if (x == null) {
            y = x = l2;
        } else {
            y = x = l1;
        }
        int n = 0;
        for (; x != null; x = x.next) {
            x.val += n;
            if (x.val >= 10) {
                n = 1;
                x.val -= 10;
                if (x.next == null) {
                    x.next = new ListNode(1);
                    break;
                }
            } else {
                n = 0;
            }
        }
        return y;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
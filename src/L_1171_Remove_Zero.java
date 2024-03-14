public class L_1171_Remove_Zero {
    class Solution {
        public ListNode removeZeroSumSublists(ListNode head) {
            int sum = 0;
            ListNode start = head;
            ListNode temp = head;
            while (temp != null) {
                sum = sum + temp.val;
                if (start.val == sum) {
                    start.next = temp.next;
                } else if (sum == 0) {
                    start = temp.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }
    }
}

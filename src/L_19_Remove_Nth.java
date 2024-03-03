public class L_19_Remove_Nth {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int len = 0;
            ListNode temp = head;
            ListNode rmNode = head;
            ListNode rmPrevi = head;

            while (temp != null) {
                len++;
                if (len >= n) {
                    rmPrevi = rmNode;
                    rmNode = rmNode.next;
                }
                temp = temp.next;
            }
            if (rmNode == head) {
                if (rmNode.next == null) {
                    return null;
                } else {
                    head = head.next;
                    return head;
                }
            } else if (n == 1) {
                rmNode = null;
                return head;
            } else {
                rmPrevi.next = rmNode.next;
                rmNode = null;
                return head;
            }
        }
    }
}

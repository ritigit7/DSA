public class L_1669_Merge {
    class Solution {
        public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

            ListNode heaNode2 = list2;
            while (heaNode2 != null) {
                if (heaNode2.next == null) {
                    break;
                }
                heaNode2 = heaNode2.next;
            }

            ListNode heaNode = list1;
            ListNode head = list1;
            int i = 0;
            while (heaNode != null) {
                if (i == a) {
                    head.next = list2;
                }
                if (i == b) {
                    heaNode2.next = heaNode.next;
                }
                i++;
                head = heaNode;
                heaNode = heaNode.next;

            }
            return list1;
        }
    }
}

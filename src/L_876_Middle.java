public class L_876_Middle {
    class Solution {
        public static ListNode middleNode(ListNode head) {
            ListNode midNode = head;
            ListNode tempNode = head;
            int t = 0;
            int k = 0;
            while (tempNode != null) {
                t++;
                if (k != ((t / 2) + 1)) {
                    k++;
                    midNode = midNode.next;
                }
                tempNode = tempNode.next;
            }

            return midNode;
        }
    }
}

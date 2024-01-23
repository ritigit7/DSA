public class L_2_Add_Two_Numbers {
    static ListNode head = null;
    static ListNode head2 = null;

    public static void main(String[] args) {
        // int[] l = { 2, 4, 3 }, m = { 5, 6, 4 };
        // int[] l = { 2, 4, 9 }, m = { 5, 6, 4, 9 };
        // int[] l = { 9, 9, 1 }, m = { 1 };
        // int[] l = { 9, 9, 9, 9, 9, 9, 9 }, m = { 9, 9, 9, 9 };
        // int[] m = { 9, 9, 9, 9, 9, 9, 9 }, l = { 9, 9, 9, 9 };
        int[] m = { 0}, l = { 0 };
        for (int i : l) {
            ListNode newNode = new ListNode(i);
            if (head == null) {
                head = newNode;
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        for (int i : m) {
            ListNode newNode = new ListNode(i);
            if (head2 == null) {
                head2 = newNode;
            } else {
                ListNode current = head2;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        L_2_Add_Two_Numbers ob = new L_2_Add_Two_Numbers();
        ob.display(head);
        ob.display(head2);
        ob.display(ob.addTwoNumbers(head, head2));
    }

    public void display(ListNode hea) {
        ListNode current = hea;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode addTwoNumbers(ListNode hea, ListNode hea2) {
        ListNode current = hea;
        ListNode current2 = hea2;
        int temp = 0;
        int total = 0;
        int f = 0;
        int l = 0;
        ListNode h = null;
        while (current != null || current2 != null) {
            if (current != null && current2 != null) {
                f = current.val;
                l = current2.val;
                total = f + l + temp;
                temp = 0;
                if (total > 9) {
                    temp = total / 10;
                    total = total % 10;
                }
                // System.out.println(total);

                ListNode answer = new ListNode(total);
                if (h == null) {
                    h = answer;
                } else {
                    ListNode cu = h;
                    while (cu.next != null) {
                        cu = cu.next;
                    }
                    cu.next = answer;
                }

                current = current.next;
                current2 = current2.next;
            } else {
                if (current == null) {
                    total = current2.val + temp;
                    temp = 0;
                    if (total > 9) {
                        temp = total / 10;
                        total = total % 10;
                    }
                    // System.out.println(total);
                    ListNode answer = new ListNode(total);
                    if (h == null) {
                        h = answer;
                    } else {
                        ListNode cu = h;
                        while (cu.next != null) {
                            cu = cu.next;
                        }
                        cu.next = answer;
                    }
                    current2 = current2.next;
                } else {
                    total = current.val + temp;
                    temp = 0;
                    if (total > 9) {
                        temp = total / 10;
                        total = total % 10;
                    }
                    // System.out.println(total);
                    ListNode answer = new ListNode(total);
                    if (h == null) {
                        h = answer;
                    } else {
                        ListNode cu = h;
                        while (cu.next != null) {
                            cu = cu.next;
                        }
                        cu.next = answer;
                    }
                    current = current.next;
                }
            }
        }
        if (temp == 1) {
            // System.out.println(1);
            ListNode answer = new ListNode(1);
            if (h == null) {
                h = answer;
            } else {
                ListNode cu = h;
                while (cu.next != null) {
                    cu = cu.next;
                }
                cu.next = answer;
            }
        }
        return h;
    }
}

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
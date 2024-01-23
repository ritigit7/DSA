class Nodee {
    int data;
    Nodee next;

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_list {
    Nodee head = null;

    public static void main(String[] args) {
        Linked_list obList = new Linked_list();
        obList.add(5);
        obList.add(7);
        obList.add(4);
        obList.display();
    }

    public void add(int dt) {
        Nodee newNode = new Nodee(dt);
        if (head == null) {
            head = newNode;
        } else {
            Nodee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Nodee current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

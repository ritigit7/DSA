import java.util.LinkedList;

public class L_5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }
    }

}

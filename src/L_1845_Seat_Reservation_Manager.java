import java.util.ArrayList;
import java.util.Collections;

public class L_1845_Seat_Reservation_Manager {
    public static void main(String[] args) {
        SeatManager ob = new SeatManager(4);
        System.out.println(ob.reserve());
        ob.unreserve(1);
        System.out.println(ob.reserve());
        System.out.println(ob.reserve());
        System.out.println(ob.reserve());
        ob.unreserve(2);
        System.out.println(ob.reserve());
        ob.unreserve(1);
        System.out.println(ob.reserve());
        ob.unreserve(2);
    }
}

class SeatManager {
    int t = 0;
    ArrayList<Integer> array = new ArrayList<>();

    public SeatManager(int n) {
        for (int i = 0; i < n; i++) {
            array.add(i + 1);
        }
        System.out.println(array);
    }

    public int reserve() {
        int min = Collections.min(array);
        array.remove(array.indexOf(min));
        System.out.println(array);
        return min;
    }

    public void unreserve(int seatNumber) {
        array.add(0, seatNumber);
        System.out.println(array);
    }
}
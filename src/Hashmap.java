import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(4,8);
        map.put(9, 7);
        System.out.println(map);
        for (Integer t  : map.keySet()) {
            System.out.println(t);   
        }
    }
}

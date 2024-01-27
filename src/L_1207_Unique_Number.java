import java.util.HashMap;

public class L_1207_Unique_Number {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2 }));
        // System.out.println(uniqueOccurrences(new int[] { -4, 3, 3 }));
        // System.out.println(uniqueOccurrences(new int[] { 1, 1, 1, 2, 2, 3, 3, 3 }));
        // System.out.println(uniqueOccurrences(new int[] { 1, 1, 1, 2, 2, 3 }));
    }

    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        System.out.println(map);
        for (int t : map.values()) {
            map2.put(t, 0);
        }
        System.out.println(map2);
        return map.size() == map2.size();

    }
}

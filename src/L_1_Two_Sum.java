import java.util.HashMap;

public class L_1_Two_Sum {
    public static  int[] main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 4;
        int t = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(t++, i);
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int se = target - a;
            if (map.containsValue(se)) {
                int index = map.get(se);
                if (index == i) {
                    continue;
                }
                return new int[] { i, index };
            }
        }
        return arr;
    }
}

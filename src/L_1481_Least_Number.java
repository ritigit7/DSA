import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class L_1481_Least_Number {
    class Solution {
        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int length = arr.length;
            for (int i = 0; i < length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            System.out.println(map);
            ArrayList<Integer> aList = new ArrayList<>(map.values());
            Collections.sort(aList);
            System.out.println(aList);
            int i = 0;
            while (k - aList.get(i) >= 0) {
                k = k - aList.get(0);
                aList.remove(0);
            }
            System.out.println(aList);
            return aList.size();
        }
    }

    public static void main(String[] args) {
        L_1481_Least_Number.Solution ob = new L_1481_Least_Number().new Solution();
        // System.out.println(ob.findLeastNumOfUniqueInts(new int[] { 5, 5, 4 }, 1));
        System.out.println(ob.findLeastNumOfUniqueInts(new int[] { 4, 3, 1, 1, 3, 3, 2 }, 3));
        // System.out.println(ob.findLeastNumOfUniqueInts(new int[] { 2, 1, 1, 3, 3, 3
        // }, 3));

    }
}

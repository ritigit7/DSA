import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class L_1578_Minimum_Time {
    public static void main(String[] args) {
        L_1578_Minimum_Time ob = new L_1578_Minimum_Time();
        // String str = "abaac";
        // int[] arr = { 1, 2, 3, 4, 5 };

        // String str = "aabaa";
        // int[] arr = { 1, 2, 3, 4, 1 };

        // String str = "abc";
        // int[] arr = { 1, 2, 3 };

        String str = "aaabbbabbbb";
        int[] arr = { 3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1 };

        System.out.println(ob.minCost(str, arr));
    }

    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int len = colors.length();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(colors.charAt(i), new ArrayList<>());
        }

        for (Entry<Character, ArrayList<Integer>> entry : map.entrySet()) {
            char c = entry.getKey();
            for (int i = 0; i < len; i++) {
                if (c == colors.charAt(i)) {
                    entry.getValue().add(i);
                }
            }
            int t = 0;
            int ln = entry.getValue().size();
            System.out.println(entry.getValue());
            int k = 0;
            while (t < ln) {
                if (entry.getValue().get(k + 1) - entry.getValue().get(k) == 1) {
                    if (neededTime[entry.getValue().get(k + 1)] > neededTime[entry.getValue().get(k)]) {
                        ans = ans + neededTime[entry.getValue().get(k)];
                        entry.getValue().remove(k);
                        System.out.println(entry.getValue());
                    } else {
                        ans = ans + neededTime[entry.getValue().get(t + 1)];
                        entry.getValue().remove(t + 1);
                        System.out.println(entry.getValue());
                    }
                }
                t++;
            }

            // int ln = entry.getValue().size();
            // for (int i = 0; i < ln - 1; i++) {
            // if (entry.getValue().get(i + 1) - entry.getValue().get(i) == 1) {
            // if (neededTime[entry.getValue().get(i + 1)] >
            // neededTime[entry.getValue().get(i)]) {
            // ans = ans + neededTime[entry.getValue().get(i)];
            // System.out.println(entry.getValue().get(i) + "," +
            // neededTime[entry.getValue().get(i)]);
            // } else {
            // ans = ans + neededTime[entry.getValue().get(i + 1)];
            // System.out.println(entry.getValue().get(i + 1) + "," +
            // neededTime[entry.getValue().get(i + 1)]);
            // }
            // }
            // }
        }
        System.out.println(map);

        return ans;
    }
}

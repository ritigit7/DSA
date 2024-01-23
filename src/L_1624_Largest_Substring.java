import java.util.HashMap;
import java.util.Map.Entry;

public class L_1624_Largest_Substring {
    public static void main(String[] args) {
        L_1624_Largest_Substring ob = new L_1624_Largest_Substring();
        // String str = "aa";
        String str = "mgntdygtxrvxjnwksqhxuxtrv";
        // String str = "cbzxy";
        // String str = "abca";
        System.out.println(ob.maxLengthBetweenEqualCharacters(str));
    }

    private int maxLengthBetweenEqualCharacters(String s) {

        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = length - 1; i >= 0; i--) {
            map2.put(s.charAt(i), i);
        }
        System.out.println(map);
        System.out.println(map2);
        for (Entry<Character, Integer> entry : map.entrySet()) {
            char w = entry.getKey();
            int temp = Math.abs(map.get(w) - map2.get(w));
            if (temp > ans) {
                ans = temp;
            }
        }
        return ans - 1;

        // int ans = 0;
        // HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        // int length = s.length();
        // for (int i = 0; i < length; i++) {
        // map.put(s.charAt(i), new ArrayList<Integer>());
        // }
        // for (Entry<Character, ArrayList<Integer>> entry : map.entrySet()) {
        // for (int i = 0; i < length; i++) {
        // if (s.charAt(i) == entry.getKey()) {
        // entry.getValue().add(i);
        // }
        // }
        // int t = (entry.getValue().get(entry.getValue().size() - 1)) -
        // (entry.getValue().get(0));
        // if (ans < t) {
        // ans = t;
        // }
        // }
        // System.out.println(map);
        // return ans - 1;
    }

    // int[][] table = new int[26][2];
    // int max = 0;
    // for (int i = 0; i < s.length(); i++) {
    // int ind = i + 1;
    // int c = s.charAt(i) - 'a';
    // System.out.print(c + ",");
    // if (table[c][0] == 0)
    // table[c][0] = ind;
    // else
    // table[c][1] = ind;
    // }
    // System.out.println();
    // for (int i = 0; i < s.length(); i++) {
    // System.out.print(table[i][0] + ",");
    // }
    // System.out.println();
    // for (int i = 0; i < s.length(); i++) {
    // System.out.print(table[i][1] + ",");
    // }

    // for (int i = 0; i < 26; i++)
    // if (table[i][0] * table[i][1] != 0)
    // max = Math.max(max, table[i][1] - table[i][0]);

    // return max - 1;
    // }

}
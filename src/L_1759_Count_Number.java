import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class L_1759_Count_Number {
    public static void main(String[] args) {
        L_1759_Count_Number ob = new L_1759_Count_Number();
        ob.countHomogenous("abbcccaa");
    }

    public int countHomogenous(String s) {
        ArrayList<Integer> ar = new ArrayList<>();
        char[] c1 = s.toCharArray();
        System.out.println(c1);
        char[] c2 = s.toCharArray();
        int len = c1.length;
        // int t=0;
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(c1[i], c2[i]);
        }
        System.out.println(map);
        for (Entry<Character, Character> entry : map.entrySet()) {
            System.out.println(entry.getValue());

            // System.out.println(s.indexOf(entry.getValue()));
            for (char c : c2) {
                if (c==entry.getValue()) {
                    // ar.add(s);
                }
            }
            System.out.println(ar);
        }
        return 0;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class L_6_Zigzag_Conversion {
    public static void main(String[] args) {
        L_6_Zigzag_Conversion ob = new L_6_Zigzag_Conversion();
        // ob.convert("PAYPALISHIRING", 4);
        System.out.println(ob.convert("A", 2));
        System.out.println(ob.convert("AB", 1));
    }

    public String convert(String s, int numRows) {
        if (s.length()<numRows || numRows==1) {
            return s;
        }
        int len = s.length();
        char[] newarr = new char[len];
        int t = 0;
        int w = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            map.put(t, new ArrayList<Integer>());
            map.get(t++).add(i);
        }
        int j = t - 2;
        int d = 1;
        while (t < len) {
            if (d == 1) {
                if (j >= 0) {
                    map.get(j--).add(t++);
                } else {
                    d = -1;
                    j = j + 2;
                }
            } else {
                if (j < numRows) {
                    map.get(j++).add(t++);
                } else {
                    d = 1;
                    j = j - 2;
                }
            }
        }
        for (Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            for (int in : entry.getValue()) {
                System.out.println(in);
                newarr[w++] = s.charAt(in);
            }
        }
        String sst=new String(newarr);
        System.out.println(sst);
        return sst;
    }
}

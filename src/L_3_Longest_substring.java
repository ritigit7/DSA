import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class L_3_Longest_substring {
    public static void main(String[] args) {
        L_3_Longest_substring ob = new L_3_Longest_substring();
        // String str = "abcabcbb";
        // String str = "pwwkew";
        // String str = "bcddeef";
        String str = "dvdf";
        // String str = "bbbbb";
        System.out.println(ob.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        char[] c1 = s.toCharArray();
        System.out.println(c1);
        char[] c2 = s.toCharArray();
        int ans;
        StringBuffer sst = new StringBuffer();
        int p = 0;
        int len = c1.length;
        LinkedHashMap<Character, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(c1[i], c2[i]);
        }
        System.out.println(map);
        HashMap<Integer, Character> map2 = new HashMap<>();
        for (Entry<Character, Character> t : map.entrySet()) {
            map2.put(p++, t.getKey());
            sst.append(t.getKey());
        }
        System.out.println(map2);
        System.out.println(sst);
        while (s.contains(sst.toString()) == false) {
            sst = sst.delete(0, 1);
            System.out.println(sst);
        }
        ans = sst.toString().length();
        return ans;
    }
}

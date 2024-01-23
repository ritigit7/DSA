import java.util.HashMap;
import java.util.Map.Entry;

public class L_1347_Minimum_Number {
    public static void main(String[] args) {
        // System.out.println(minSteps("bab", "aba"));
        System.out.println(minSteps("leetcode", "practice"));
        // System.out.println(minSteps("anagram", "mangaar"));
        // System.out.println(minSteps("gctcxyuluxjuxnsvmomavutrrfb",
        // "qijrjrhqqjxjtprybrzpyfyqtzf"));
    }

    static int minSteps(String s, String t) {

        int len = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        map.put('d', 0);
        map.put('e', 0);
        map.put('f', 0);
        map.put('g', 0);
        map.put('h', 0);
        map.put('i', 0);
        map.put('j', 0);
        map.put('k', 0);
        map.put('l', 0);
        map.put('m', 0);
        map.put('n', 0);
        map.put('o', 0);
        map.put('p', 0);
        map.put('q', 0);
        map.put('r', 0);
        map.put('s', 0);
        map.put('t', 0);
        map.put('u', 0);
        map.put('v', 0);
        map.put('w', 0);
        map.put('x', 0);
        map.put('y', 0);
        map.put('z', 0);

        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        System.out.println(map);
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 0) {
                ans = ans + Math.abs(entry.getValue());
            }
        }
        return ans;
    }
}

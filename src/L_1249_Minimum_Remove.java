import java.util.HashMap;

public class L_1249_Minimum_Remove {
    class Solution {
        public String minRemoveToMakeValid(String s) {
            HashMap<Integer, Character> map = new HashMap<>();
            int i = 0;
            for (char c : s.toCharArray(0)) {
                if (c == '(' || c == ')') {
                    map.put(i, c);
                }
                i++;
            }
            System.out.println(map);
            return "";
        }
    }
}
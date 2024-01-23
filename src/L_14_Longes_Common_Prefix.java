import java.util.ArrayList;

public class L_14_Longes_Common_Prefix {
    public static void main(String[] args) {
        // String[] str = { "flower", "flow", "flight" };
        // String[] str = { "dog", "racecar", "car" };
        // String[] str = { "ofkddog", "ofkracecar", "ofercar" };
        // String[] str = { "a" };
        String[] str = { "cir", "car" };

        L_14_Longes_Common_Prefix ob = new L_14_Longes_Common_Prefix();
        System.out.println(ob.longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        } else {
            ArrayList<Character> arrayList = new ArrayList<>();
            int length = strs.length;
            int min = strs[0].length();
            for (String str : strs) {
                System.out.println(str);
                if (min > str.length()) {
                    min = str.length();
                }
            }
            System.out.println(min);
            out: for (int i = 0; i < min; i++) {
                char temp = strs[0].charAt(i);
                for (int j = 1; j < length; j++) {
                    if (strs[j].charAt(i) == temp) {
                        if (j == length - 1) {
                            arrayList.add(temp);
                        }
                    } else {
                        break out;
                    }
                }
            }
            System.out.println(arrayList);

            StringBuilder sb = new StringBuilder();
            for (Character item : arrayList) {
                sb.append(item);
            }
            String myString = sb.toString();
            return myString;
        }
    }
}

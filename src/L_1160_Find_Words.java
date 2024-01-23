import java.util.HashMap;

public class L_1160_Find_Words {
    public static void main(String[] args) {
        String[] words = { "cat", "bt", "hat", "tree" };
        String chars = "atach";
        L_1160_Find_Words ob = new L_1160_Find_Words();
        ob.countCharacters(words, chars);
    }

    public int countCharacters(String[] words, String chars) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String string : words) {
            map.put(string, 0);
        }
        int len = chars.length();
        for (int i = 0; i < len; i++) {
            char c = chars.charAt(i);
            System.out.println(c);
        }
        System.out.println(map);
        return 0;
    }
}

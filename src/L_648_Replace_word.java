import java.util.HashMap;
import java.util.List;

public class L_648_Replace_word {
    public String replaceWords(String[] dictionary, String sentence) {
        HashMap<Character, String> map = new HashMap<>();
        for (String word : dictionary) {
            map.put(word.charAt(0), word);
        }
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i].charAt(0))) {
                if (words[i].contains(map.get(words[i].charAt(0)))) {
                    words[i] = map.get(words[i].charAt(0));
                }
            }
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        L_648_Replace_word l = new L_648_Replace_word();
        String[] dict = { "cat", "bat", "rat" };
        String sentence = "the cattle was rattled by the battery";
        System.out.println(l.replaceWords(dict, sentence));
    }

}
import java.util.ArrayList;
import java.util.List;

public class L_1002_Find_Common {
    public List<String> commonChars(String[] words) {
        int i = 0;
        int flag = 1;
        ArrayList<String> ans = new ArrayList();
        String[] result = words[0].split("");
        for (String s : result) {
            System.out.println(s);
            String temp = s;
            for (i = 1; i < words.length; i++) {
                if (words[i].contains(s)) {
                    flag++;
                    words[i] = words[i].replaceFirst(s, "");
                }
            }
            if (flag == words.length) {
                ans.add(temp);
            }
            flag = 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        L_1002_Find_Common obj = new L_1002_Find_Common();
        // String[] words = { "bella", "label", "roller" };
        String[] words = { "cool", "lock", "cook" };
        List<String> result = obj.commonChars(words);
        System.out.println(result);
    }
}

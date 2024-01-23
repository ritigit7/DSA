import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class L_1930_Unique_Length {
    public static void main(String[] args) {
        L_1930_Unique_Length ob = new L_1930_Unique_Length();
        // ob.countPalindromicSubsequence("abc");
        ob.countPalindromicSubsequence("abbacdba");
        // ob.countPalindromicSubsequence("aabca");
        // ob.countPalindromicSubsequence("bbcbaba");
    }

    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        int len = s.length();
        char[] ch = s.toCharArray();
        HashMap<Character, Character> ma = new HashMap<>();
        for (char c : ch) {
            ma.put(c, c);
        }
        System.out.println(ma);
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        for (Entry<Character, Character> entry : ma.entrySet()) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if (entry.getValue() == ch[i]) {
                    arr.add(i);
                }
            }
            map.add(arr);
        }
        System.out.println(map);

        // for (ArrayList<Integer> arrayList : map) {
        //     System.out.println(arrayList);
        //     if (arrayList.size() >= 3) {
        //         ans++;
        //     }

        // }
        
        System.out.println(ans);
        return ans;
    }
}

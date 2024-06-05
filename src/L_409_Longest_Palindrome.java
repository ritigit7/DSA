import java.util.HashMap;

public class L_409_Longest_Palindrome {
    public int longestPalindrome(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        return 0;
        for (int i : map.values()) {

        }
    }
}

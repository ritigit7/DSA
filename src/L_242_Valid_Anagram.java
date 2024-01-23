// import java.util.Arrays;

public class L_242_Valid_Anagram {
    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";
        String s = "cat", t = "rat";
        // String s = "anagram", t = "eagaram";
        L_242_Valid_Anagram ob = new L_242_Valid_Anagram();
        System.out.println(ob.isAnagram(s, t));
    }

    // public boolean isAnagram(String s, String t) {
    // char[] charArray = s.toCharArray();
    // char[] charArray2 = t.toCharArray();

    // Arrays.sort(charArray);
    // Arrays.sort(charArray2);
    // String sortedString = new String(charArray);
    // String sortedString2 = new String(charArray2);
    // System.out.println(sortedString + "," + sortedString2);
    // if (sortedString.equals(sortedString2)) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] set = new int[26];
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) - 'a');
            set[s.charAt(i) - 'a']++;
            set[t.charAt(i) - 'a']--;
        }
        // for (int i : set) {
        // System.out.println(i);
        // }
        for (int n : set) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}

public class L_1897_Redistribute_Characters {
    public static void main(String[] args) {
        L_1897_Redistribute_Characters ob = new L_1897_Redistribute_Characters();
        String[] str = { "abc", "aabc", "bc" };
        // String[] str = { "ab", "a" };
        System.out.println(ob.makeEqual(str));
    }

    public boolean makeEqual(String[] words) {
        int length = words.length;
        // if (length < 3) {
        // return false;
        // } else {
        for (int i = 2; i < length;) {
            if (words[0] == (words[1].charAt(0) + words[i])) {
                return true;
            } else {
                return false;
            }
        }
        // }
        return false;
    }
}

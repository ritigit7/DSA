public class L_2108_Find_First {
    class Solution {
        public String firstPalindrome(String[] words) {
            String ans = "";
            for (String str : words) {
                boolean isPalindrome = true;
                for (int i = 0; i < str.length() / 2; i++) {
                    if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    ans = str;
                    break;

                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        L_2108_Find_First.Solution ob = new L_2108_Find_First().new Solution();
        System.out.println(ob.firstPalindrome(new String[] { "abc", "car", "ada", "racecar", "cool" }));
        System.out.println(ob.firstPalindrome(new String[] { "notapalindrome", "racecar" }));
        System.out.println(ob.firstPalindrome(new String[] { "def", "ghi" }));
    }
}

import java.util.ArrayList;

public class L_5_Longest_Palindromic {
    class Solution {
        static int l = 0;
        static ArrayList<String> aList = new ArrayList<>();

        public String longestPalindrome(String s) {
            String dp[][] = new String[s.length()][s.length()];
            String ans = "";
            fn(s, 0, s.length() - 1, dp, 0);
            for (String str : aList) {
                if (str.length() == l) {
                    ans = str;
                    System.out.println(str);
                }
            }
            return ans;
        }

        public static String fn(String str, int start, int end, String[][] dp, int len) {

            if (dp[start][end] != null) {
                return dp[start][end];
            }

            if (isPalindrome(str, start, end)) {
                aList.add(str.substring(start, end + 1));
                if (l < end + 1 - start) {
                    l = end + 1 - start;
                    System.out.println(l);
                }
                return dp[start][end] = str.substring(start, end + 1);
            }
            if (start < end) {
                fn(str, start, end - 1, dp, l);
                fn(str, start + 1, end, dp, l);
                System.out.println(start + "," + end + " len:" + l);
            }
            return dp[start][end];
        }

        public static boolean isPalindrome(String s, int start, int end) {
            int forward = start;
            int backward = end;
            while (backward > forward) {
                char forwardChar = s.charAt(forward++);
                char backwardChar = s.charAt(backward--);
                if (forwardChar != backwardChar)
                    return false;
            }
            return true;
        }

    }

    public static void main(String[] args) {
        L_5_Longest_Palindromic.Solution ob = new L_5_Longest_Palindromic().new Solution();
        System.out.println(ob.longestPalindrome("babad"));
        // System.out.println(ob.longestPalindrome("cbbd"));
    }
}

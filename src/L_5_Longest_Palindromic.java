public class L_5_Longest_Palindromic {
    class Solution {

        public String longestPalindrome(String s) {
            String dp[][] = new String[s.length()][s.length()];
            String ans = fn(s, 0, s.length() - 1, dp, 0);
            // for (String[] strings : dp) {
            // for (String strings2 : strings) {
            // System.out.print(strings2 + " ");
            // }
            // System.err.println();
            // }
            return ans;
        }

        public static String fn(String str, int start, int end, String[][] dp, int len) {

            if (dp[start][end] != null) {
                return dp[start][end];
            }

            if (isPalindrome(str, start, end)) {
                // if (len < (end + 1) - start) {
                System.out.print(len);
                len = (end + 1) - start;
                // }
                return dp[start][end] = str.substring(start, end + 1);
            }
            int l = len;
            if (start < end) {
                fn(str, start, end - 1, dp, l);
                fn(str, start + 1, end, dp, l);
                System.out.println(start + "," + end);
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

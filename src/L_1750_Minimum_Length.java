public class L_1750_Minimum_Length {
    class Solution {
        public static int minimumLength(String s) {

            int start = 0;
            int end = s.length() - 1;
            int temp = 0;
            int tp = 0;
            if (s.charAt(start) == s.charAt(end)) {
                while (start < end) {
                    if (s.charAt(start) == s.charAt(end)) {
                        start++;
                    } else {
                        while (s.charAt(start - 1) == s.charAt(end)) {
                            end--;
                        }
                    }
                    temp = end - start;
                    if (tp == temp) {
                        break;
                    }
                    tp = temp;
                }
                if (start == end) {
                    end--;
                }
                System.out.println(start + "," + end);
                System.out.println(s.substring(start, end + 1));
                return end - start + 1;
            } else {
                System.out.println(start + "," + end);
                System.out.println(s.substring(start, end + 1));
                return end - start + 1;
            }

        }
    }

    public static void main(String[] args) {
        // System.out.println(Solution.minimumLength("cabaabac"));
        // System.out.println(Solution.minimumLength("bccabb"));
        // System.out.println(Solution.minimumLength("ca"));
        System.out.println(Solution.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"));
    }
}

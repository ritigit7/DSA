import java.util.Arrays;

public class L_2864_Maximum_Odd {
    class Solution {
        public static String maximumOddBinaryNumber(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println(count);
            char[] c = new char[s.length()];
            Arrays.fill(c, '0');
            if (count > 0) {
                c[c.length - 1] = '1';
                count--;
                int i = 0;
                while (count > 0) {
                    c[i++] = '1';
                    count--;
                }
                return new String(c);
            } else {
                return s;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.maximumOddBinaryNumber("010"));
        System.out.println(Solution.maximumOddBinaryNumber("0101"));
    }
}

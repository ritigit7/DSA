public class L_231_Power_of_Two {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            String binary = Integer.toBinaryString(n);
            System.out.println(binary);
            int sum = 0;
            for (int i = 0; i < binary.length(); i++) {
                sum += Character.getNumericValue(binary.charAt(i));
                if (sum > 1) {
                    break;
                }
            }
            // System.out.println(sum);
            System.out.println(Integer.bitCount(n));
            if (sum == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        L_231_Power_of_Two.Solution ob = new L_231_Power_of_Two().new Solution();
        System.out.println(ob.isPowerOfTwo(2147483647));
    }
}

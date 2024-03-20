public class L_525_Contiguous_Array {
    class Solution {
        public int findMaxLength(int[] nums) {
            int len = 0;
            int zero = 0;
            int one = 0;
            for (int i : nums) {
                if (i == 0) {
                    zero++;
                } else {
                    one++;
                }
                System.out.println(zero+" "+one);
                if (zero == one && len <  zero+one) {
                    len = zero+one;
                }
            }
            return len;
        }
    }
}

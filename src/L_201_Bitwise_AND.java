public class L_201_Bitwise_AND {
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            int shift = 0;
            while (left != right) {
                left >>= 1;
                right >>= 1;
                shift++;
            }
            return (left << shift);
        }
    }

    public static void main(String[] args) {
        L_201_Bitwise_AND.Solution ob = new L_201_Bitwise_AND().new Solution();
        System.out.println(ob.rangeBitwiseAnd(5, 7));
    }
}

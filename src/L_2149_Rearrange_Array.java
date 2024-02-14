public class L_2149_Rearrange_Array {
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int arrp[] = new int[nums.length / 2];
            int arrn[] = new int[nums.length / 2];
            int t = 0, k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    arrn[t++] = nums[i];
                } else {
                    arrp[k++] = nums[i];
                }
            }
            for (int i : arrn) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i : arrp) {
                System.out.print(i + " ");
            }
            System.out.println();
            t = 0;
            k = 0;
            for (int i = 0; i < nums.length - 1; i = i + 2) {
                nums[i] = arrn[t++];
                nums[i + 1] = arrp[k++];
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        L_2149_Rearrange_Array.Solution ob = new L_2149_Rearrange_Array().new Solution();
        // new int[] { 3, 1, -2, -5, 2, -4 }
        // new int[] { -1,1}
        for (int i : ob.rearrangeArray(
                new int[] { 28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31 })) {
            System.out.print(i + " ");
        }
    }
}

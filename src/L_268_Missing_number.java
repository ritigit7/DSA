import java.util.Arrays;

public class L_268_Missing_number {
    class Solution {
        public int missingNumber(int[] nums) {
            int ans = 0;
            Arrays.sort(nums);
            for (int i = 0; i <= nums.length; i++) {
                if (i == nums.length) {
                    ans = nums[i - 1] + 1;
                    break;
                }
                if (i != nums[i]) {
                    ans = i;
                    break;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        L_268_Missing_number.Solution ob = new L_268_Missing_number().new Solution();
        // System.out.println(ob.missingNumber(new int[] { 3, 0, 1 }));
        // System.out.println(ob.missingNumber(new int[] { 0, 1 }));
        System.out.println(ob.missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}

import java.util.Arrays;

public class L_645_Set_Mismatch {
    public static void main(String[] args) {
        findErrorNums(new int[] { 1, 2, 2, 4 });
        findErrorNums(new int[] { 1, 1 });
        findErrorNums(new int[] { 2, 3, 3, 4, 5, 6 });
        findErrorNums(new int[] { 1, 3, 3 });
        findErrorNums(new int[] { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 });
        findErrorNums(new int[] { 1, 3, 4, 5, 5, 7, 8 });
    }

    static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int p = 0;
        int[] ans = new int[2];
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                p = i + 1;
                ans[0] = nums[i + 1];
                break;
            }

        }
        if (nums[0] == 1) {
            if (p + 1 < length) {

                if (nums[p] + 1 == nums[p + 1]) {
                    ans[1] = length;
                } else {
                    ans[1] = nums[p + 1] - 1;
                }
            } else {
                ans[1] = nums[p - 1] + 1;
            }
        } else {
            ans[1] = 1;
        }
        // int t = nums[0];
        // for (int i = 0; i < length; i++) {
        // if (nums[i] == t) {
        // t++;
        // } else {
        // ans[0] = nums[i];
        // if (nums[0] != 1) {
        // ans[1] = 1;
        // } else {
        // if (i < length - 1) {
        // if (nums[0] == 1 && nums[i + 1] == t) {
        // ans[1] = length + 1;
        // } else {
        // ans[1] = t;
        // }
        // } else {
        // ans[1] = nums[i - 1] + 1;
        // }
        // }
        // break;
        // }
        // }
        System.out.println(ans[0] + "," + ans[1]);
        return ans;
    }
}

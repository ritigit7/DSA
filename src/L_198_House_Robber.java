public class L_198_House_Robber {

    public static void main(String[] args) {
        System.out.println("->" + rob(new int[] { 1, 2, 3, 1 }));
        System.out.println("->" + rob(new int[] { 2, 1, 1, 2 }));
        System.out.println("->" + rob(new int[] { 2, 7, 9, 3, 1 }));
        System.out.println("->" + rob(new int[] { 1, 2 }));
        System.out.println("->" + rob(new int[] { 0, 0, 0 }));
    }

    static String rob(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int sum2 = 0;
        int pre = 0;
        int pre2 = 0;
        if (len > 2) {
            sum = nums[0];
            int i = 2;
            while (i < len) {
                int[] temp = mx(nums, i);
                sum = sum + temp[0];
                i = temp[1];
                if (sum == pre) {
                    break;
                }
                pre = sum;
            }

        } else {
            sum = mx(nums, 0)[0];
        }
        if (len > 2) {
            int i2 = 1;
            sum2 = nums[1];
            while (i2 < len) {
                int[] temp2 = mx(nums, i2);
                sum2 = sum2 + temp2[0];
                i2 = temp2[1];
                if (sum2 == pre2) {
                    break;
                }
                pre2 = sum2;
            }
        } else {
            sum2 = mx(nums, 0)[0];
        }
        return "sum:" + sum + " sum2:" + sum2;
    }

    static int[] mx(int[] nums, int start) {
        int max = 0;
        int max_index = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                max_index = i + 2;
            }
        }
        return new int[] { max, max_index };
    }
}

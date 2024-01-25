import java.util.ArrayList;
import java.util.Arrays;

public class L_198_House_Robber {

    public static void main(String[] args) {
        System.out.println("->" + rob3(new int[] { 1, 2, 3, 1 }));
        System.out.println("->" + rob3(new int[] { 2, 1, 1, 2 }));
        System.out.println("->" + rob3(new int[] { 2, 7, 9, 3, 1 }));
        System.out.println("->" + rob3(new int[] { 1, 2 }));
        System.out.println("->" + rob3(new int[] { 0, 0, 0 }));
        System.out.println("->" + rob3(new int[] { 1, 3, 1 }));
        System.out.println("->" + rob3(new int[] { 1, 2, 1, 0 }));
        System.out.println("->" + rob3(new int[] { 1, 2, 1, 1 }));
    }

    static int rob(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int pre = 0;
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

        return sum;
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

    static int rob2(int[] nums) {
        int len = nums.length;
        int sum = 0;
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            aList.add(nums[i]);
        }
        System.out.println(aList);
        Arrays.sort(nums);
        for (int i = len - 1; i >= 0; i--) {
            if (aList.contains(nums[i])) {
                sum = sum + nums[i];
                if (len > aList.indexOf(nums[i])) {
                    aList.remove(aList.indexOf(nums[i]));
                }
                if (0 < aList.indexOf(nums[i])) {
                    aList.remove(aList.indexOf(nums[i]));
                }
            }
        }
        System.out.println(aList);
        return sum;
    }

    static int rob3(int[] nums) {
        int pre1 = 0;
        int pre2 = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int dp = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = dp;
        }
        return pre1;
    }
}

import java.util.Arrays;

public class L_1913_Maximum_Product {
    public static void main(String[] args) {
        L_1913_Maximum_Product ob = new L_1913_Maximum_Product();
        // int[] nums = { 5, 6, 2, 7, 4 };
        int[] nums = { 4, 2, 5, 9, 7, 4, 8 };
        System.out.println(ob.maxProductDifference(nums));
    }

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length - 1;
        return (nums[length] * nums[length - 1]) - (nums[0] * nums[1]);
    }
}

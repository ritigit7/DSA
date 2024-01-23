
// import java.util.Arrays;
import java.util.HashMap;
// import java.util.Map.Entry;

public class L_2870_Minimum_Number {
    public static void main(String[] args) {
        L_2870_Minimum_Number ob = new L_2870_Minimum_Number();
        int[] arr = { 2, 3, 3, 2, 2, 4, 2, 3, 4 };
        System.out.println(ob.minOperations(arr));
    }

    public int minOperations(int[] nums) {
        int len = nums.length;
        int step = 0;
        // Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int q = fun(nums, nums[i]);
            map.put(nums[i], q);
            if (q % 2 == 0) {
                step = step + q / 2;
            } else {
                step = step + q / 3;
            }
        }
        System.out.println(map);
        return step;
    }

    static Integer fun(int[] nums, int i) {
        int t = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == i) {
                t++;
            }
        }
        return t;
    }

}

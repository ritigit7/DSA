public class L_1685_Sum_of_Absolute_Differences {
    public static void main(String[] args) {
        L_1685_Sum_of_Absolute_Differences ob = new L_1685_Sum_of_Absolute_Differences();
        int[] nums = { 2, 3, 5 };
        // int[] nums = { 1, 4, 6, 8, 10 };
        System.out.println(ob.getSumAbsoluteDifferences(nums));
        for (int i : ob.getSumAbsoluteDifferences(nums)) {
            System.out.println(i);
        }
    }

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int sum = 0;
        int i = 1;
        int j = 0;
        int k = 0;
        int m = 1;
        int t = 0;
        int sum2 = 0;
        int um = 0;
        L_1685_Sum_of_Absolute_Differences ob2 = new L_1685_Sum_of_Absolute_Differences();
        sum2 = ob2.sm(m, k, len, nums);
        k++;
        m = k + 1;
        arr[t++] = sum2;
        while (j < i && i < len) {
            sum = sum + Math.abs(nums[i] - nums[j]);
            System.out.print(Math.abs(nums[i] - nums[j]));
            j++;
            if (i == j) {
                System.out.print("," + sum + ",");
                i++;
                j = 0;
                sum2 = ob2.sm(m, k, len, nums);
                um = sum + sum2;
                System.out.println(um);
                arr[t++] = um;
                sum = 0;
                k++;
                m = k + 1;
            }
        }
        return arr;
    }

    public int sm(int m, int k, int len, int[] nums) {
        int sum2 = 0;
        while (m > k && m < len) {
            System.out.print(Math.abs(nums[k] - nums[m]));
            sum2 = sum2 + Math.abs(nums[k] - nums[m]);
            m++;
            if (len == m) {
                System.out.println("," + sum2);
                break;
            }
        }
        return sum2;
    }
}

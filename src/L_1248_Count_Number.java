public class L_1248_Count_Number {
    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        int count = 0, prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            System.out.println(prefixSum);
            if (prefixSum == k) {
                count++;
            }
            for (int j = 0; j < i; j++) {
                if (prefixSum - nums[j] == k) {
                    count++;
                }
            }

        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        L_1248_Count_Number l = new L_1248_Count_Number();
        int[] nums = { 1, 1, 2, 1, 1 };
        int k = 3;
        System.out.println(l.numberOfSubarrays(nums, k));
    }
}

public class L_1814_Count_Nice_Pairs {
    public static void main(String[] args) {
        L_1814_Count_Nice_Pairs ob = new L_1814_Count_Nice_Pairs();
        // int[] nums = { 42, 11, 1, 97 };
        int[] nums = { 13, 10, 35, 24, 76 };
        System.out.println(ob.countNicePairs(nums));
    }

    public int countNicePairs(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])) {
                    System.out.println(i + "," + j);
                    ans++;
                }
            }
        }
        return ans;
    }

    public int rev(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + (n % 10);
            n = n / 10;
        }
        return r;
    }
}

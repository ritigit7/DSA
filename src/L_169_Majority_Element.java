import java.util.Arrays;

public class L_169_Majority_Element {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }

    public static void main(String[] args) {
        L_169_Majority_Element.Solution ob = new L_169_Majority_Element().new Solution();
        System.out.println(ob.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }
}

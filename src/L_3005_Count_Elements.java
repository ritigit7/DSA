import java.util.Collections;
import java.util.HashMap;

public class L_3005_Count_Elements {
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            System.out.println(map);
            int t = Collections.max(map.values());
            System.out.println(t);

            int ans = 0;
            for (int freq : map.values())
                if (freq == t)
                    ans += t;

            return ans;
        }
    }
}

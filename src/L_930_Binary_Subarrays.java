import java.util.HashMap;


public class L_930_Binary_Subarrays {
    class Solution {
        public int numSubarraysWithSum(int[] nums, int goal) {
            int res = 0;
            int ps=0;
            HashMap<Integer,Integer>map=new HashMap<>();
            map.put(0,1);

            for (int i = 0; i < nums.length; i++) {
                ps=ps+nums[i];
                res=res+map.getOrDefault(ps-goal,0);
                map.put(ps,map.getOrDefault(ps-goal,0));
            }
            return res;
        }
    }
}

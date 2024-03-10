public class L_2540_Minimum_Common_Value {
    class Solution {
        public int getCommon(int[] nums1, int[] nums2) {
        int rn=-1;    
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i]<=nums2[j]) {
                     if (nums1[i]==nums2[j]) {
                        return nums1[i];
                    }   
                    else{
                        break;
                    }
                    }
                }
            }
            return rn;
        }
    }
}

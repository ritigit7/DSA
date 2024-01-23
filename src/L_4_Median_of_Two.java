public class L_4_Median_of_Two {
    public static void main(String[] args) {
        // int[] nums1 = { 1, 3 };
        // int[] nums2 = { 2 };
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        L_4_Median_of_Two ob = new L_4_Median_of_Two();
        System.out.println(ob.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int t = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] array = new int[l1 + l2];
        int len = array.length;
        while (p1 < l1 && p2 < l2) {
            if (nums1[p1] < nums2[p2]) {
                array[t++] = nums1[p1];
                p1++;
            } else {
                array[t++] = nums2[p2];
                p2++;
            }
        }
        if (p1 == l1) {
            while (p2 < l2) {
                array[t++] = nums2[p2];
                p2++;
            }
        }
        if (p2 == l2) {
            while (p1 < l1) {
                array[t++] = nums1[p1];
                p1++;
            }
        }
        for (int i : array) {
            System.out.println(i);
        }

        double ans;
        if (array.length % 2 == 0) {
            ans = (double) (array[len / 2] + array[(len / 2) - 1]) / 2;
        } else {
            ans = array[len / 2];
        }
        return ans;
    }
}

import java.util.ArrayList;
import java.util.HashSet;

public class L_349_Intersection {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            ArrayList<Integer> r1 = removeDuplicates(nums1);
            ArrayList<Integer> r2 = removeDuplicates(nums2);
            ArrayList<Integer> ans=new ArrayList<>();

            int[] arr = r1.stream().mapToInt(Integer::intValue).toArray();
            for (Integer integer : r2) {
                if(binarySearch(arr, integer)){
                    ans.add(integer);
                }
            }
            int[] arr2 = ans.stream().mapToInt(Integer::intValue).toArray();
            return arr2;
        }

        public static boolean binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return false;
        }

        public static ArrayList<Integer> removeDuplicates(int[] arr) {
            HashSet<Integer> hashSet = new HashSet<>();
            ArrayList<Integer> uniqueElements = new ArrayList<>();

            for (int i : arr) {
                if (!hashSet.contains(i)) {
                    hashSet.add(i);
                    uniqueElements.add(i);
                }
            }

            return uniqueElements;
        }
    }
}

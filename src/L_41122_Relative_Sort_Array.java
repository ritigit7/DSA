import java.util.Arrays;
import java.util.HashMap;

public class L_41122_Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[arr1.length];
        Arrays.sort(arr1);
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        for (int i : arr2) {
            int r = map.get(i);
            for (int j = 0; j < arr.length; j++) {

            }
        }
        return arr;

    }

    public static void main(String[] args) {
        L_41122_Relative_Sort_Array solution = new L_41122_Relative_Sort_Array();
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        int[] result = solution.relativeSortArray(arr1, arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

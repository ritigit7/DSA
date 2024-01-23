import java.util.ArrayList;
import java.util.Arrays;

public class L_1207_Unique_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3, 3, 3 };
        // int[] arr = { 1, 1, 1, 2, 2, 3 };
        System.out.println(uniqueOccurrences(arr));
    }

    static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> aList = new ArrayList<>();
        int len = arr.length - 1;

        int t = 1;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == arr[i + 1]) {
                t++;
            } else {
                aList.add(t);
                t = 1;
                temp = 1;
            }
        }
        aList.add(temp);

        System.out.println(aList);
        return true;
    }
}

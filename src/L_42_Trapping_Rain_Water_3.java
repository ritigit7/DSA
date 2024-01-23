import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;

public class L_42_Trapping_Rain_Water_3 {
    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int[] array = { 4, 2, 0, 3, 2, 5 };
        // int[] array = { 0, 1, 2, 1, 3, 5, 0, 2 };
        // int[] array = { 1,2,5,3,1,0,2};
        // int[] array = { 2,0,2 };
        int i;
        int j = array.length;
        int F_answer = 0;
        L_42_Trapping_Rain_Water_3 ob = new L_42_Trapping_Rain_Water_3();
        i = ob.max(array);
        System.out.println(i + " " + j);
        int[][] check = ob.matrix(array, i, j);
        for (int[] ks : check) {
            for (int ks2 : ks) {
                System.out.print(ks2);
            }
            System.out.println();
        }

        F_answer = F_answer + ob.answer(check, i, j);
        System.out.println(F_answer);
    }

    public int max(int[] array) {
        int m = Arrays.stream(array).max().getAsInt();
        return m;
    }

    public int[][] matrix(int[] array, int i, int j) {
        int make[][] = new int[i + 1][j];
        for (int k = 0; k < j; k++) {
            for (int l = 0; l <= i; l++) {
                if (l <= array[k]) {
                    make[l][k] = 1;
                } else {
                    make[l][k] = 0;
                }
            }
        }
        return make;
    }

    public int answer(int[][] arr, int i, int j) {
        int ans = 0;
        int pointer = 0;
        int pre = 0;
        for (int k = 0; k <= i; k++) {
            int d = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            while (pointer < j) {
                if (arr[k][pointer] == 1) {
                    map.put(d++, pointer);
                    pointer++;
                } else {
                    pointer++;
                }
            }
            System.out.println(map);
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() == 0) {
                    pre = entry.getValue();
                } else {
                    if ((entry.getValue() - pre) > 1) {
                        ans = ans + (entry.getValue() - pre - 1);
                    }
                    pre = entry.getValue();
                }
            }
            pointer = 0;
            System.out.println(ans);
        }
        return ans;
    }
}

// public int answer(int[][] arr, int j) {
// int ans = 0;
// int pointer = 0, end = 0;
// for (int k = 0; k < j; k++) {
// while (end < j) {
// if (arr[k][pointer] == 1) {
// end++;
// if (end == j) {
// break;
// }
// if (arr[k][end] == 0 && end!=j-1 ) {
// ans = ans + 1;
// } else {
// pointer = end;
// }
// } else {
// pointer++;
// end++;
// }
// }
// pointer = 0;
// end = 0;
// }
// return ans;
// }
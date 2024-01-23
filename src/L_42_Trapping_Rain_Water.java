import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;

public class L_42_Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] array = { 2,0,2 };
        // int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int i;
        int j = array.length;
        int F_answer = 0;
        L_42_Trapping_Rain_Water ob = new L_42_Trapping_Rain_Water();
        i = ob.max(array);
        int[][] check = ob.matrix(array, i, j);
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
        for (int k = 0; k < i; k++) {
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
        }
        return ans;
    }
}
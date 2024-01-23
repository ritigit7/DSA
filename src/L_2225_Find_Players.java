import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class L_2225_Find_Players {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };
        System.out.println(arr[0][1]);
        System.out.println(findWinners(arr));
    }

    static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> aList = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int len = matches.length;
        for (int number = 0; number < len; number++) {
            int a = fun(matches[number][0], matches);
            int b = fun(matches[number][1], matches);
            if (a <= 1) {
                map.put(matches[number][0], a);
            }
            if (b <= 1) {
                map.put(matches[number][1], b);
            }
        }
        System.out.println(map);
        for (Entry<Integer, Integer> lst : map.entrySet()) {
            if (lst.getValue() == 0) {
                l1.add(lst.getKey());
            }
            if (lst.getValue() == 1) {
                l2.add(lst.getKey());
            }
        }

        Collections.sort(l1);
        Collections.sort(l2);
        aList.add(l1);
        aList.add(l2);

        return aList;
    }

    static int fun(int number, int[][] matches) {
        int num = 0;
        int len = matches.length;
        for (int i = 0; i < len; i++) {
            if (matches[i][1] == number) {
                num++;
            }
        }
        return num;
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class L_452_Minimum_Number {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0)
                return 0;
            Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
            int arrow = 1;
            int end = points[0][1];
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > end) {
                    arrow++;
                    end = points[i][1];
                }
            }
            return arrow;
        }
    }

    class Solution2 {
        public static int findMinArrowShots(int[][] points) {
            int len = points.length;
            int ans = 0;
            Arrays.sort(points, new Comparator<int[]>() {
                @Override
                public int compare(final int[] entry1, final int[] entry2) {
                    return Integer.compare(entry1[0], entry2[0]);
                }
            });

            int ptr = points[0][1];
            int i = 1;
            len--;
            for (int j = 0; j < points.length; j++)
                if (points[i][0] <= ptr) {
                    len--;
                    i++;
                    if (len == 0) {
                        ans++;
                    }
                    continue;
                }
                ptr = points[i][1];
                ans++;
            }for(

        int[] row:points)
        {
            System.out.println(Arrays.toString(row));
        }return ans;
    }

    }

    public static void main(String[] args) {
        System.out.println(Solution.findMinArrowShots(new int[][] { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } }));
    }
}

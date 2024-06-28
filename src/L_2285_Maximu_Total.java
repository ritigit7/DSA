import java.util.Arrays;

public class L_2285_Maximu_Total {
    public long maximumImportance(int n, int[][] roads) {
        int[] degree = new int[n];
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }
        Arrays.sort(degree);
        // long ans = 0;
        // for (int i = 0; i < n; i++) {
        // ans += degree[i] * (i + 1);
        // }
        // return ans;

        for (int i = 0; i < degree.length - 1; i++) {
            if (degree[i] == degree[i + 1]) {
                degree[i + 1]++;
            }
        }
        for (int i = 0; i < degree.length; i++) {
            System.out.println(degree[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] roads = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 2, 4 } };
        System.out.println(new L_2285_Maximu_Total().maximumImportance(n, roads));
    }
}

public class L_576_Out_of_Boundary {
    static int ans = 0;

    public static void main(String[] args) {
        System.out.println("Final:" + findPaths(2, 2, 2, 0, 0));
        // System.out.println("Final:" + findPaths(1, 3, 3, 0, 1));
    }

    static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        for (int i = 1; i <= maxMove; i++) {
            fn(m, n, i, startRow, startColumn);
        }
        return ans;
    }

    // 1,-1,0
    // 1,0,-1
    // 1,-2,-1
    // 2,2,0
    // 1,-1,-2
    // 1,-1,2
    private static void fn(int m, int n, int i, int startRow, int startColumn) {
        if (i > 0) {
            if (startRow - i == -1) {
                ans++;
                System.out.println(i + "," + (startRow - i) + "," + startColumn);
            } else {
                fn(m, n, i - 1, startRow - i, startColumn);
            }
            if (startRow + i == m) {
                ans++;
                System.out.println(i + "," + (startRow + i) + "," + startColumn);
            } else {
                fn(m, n, i - 1, startRow + i, startColumn);
            }
            if (startColumn - i == -1) {
                ans++;
                System.out.println(i + "," + startRow + "," + (startColumn - i));
            } else {
                fn(m, n, i - 1, startRow, startColumn - i);
            }
            if (startColumn - i == n) {
                ans++;
                System.out.println(i + "," + startRow + "," + (startColumn + i));
            } else {
                fn(m, n, i - 1, startRow, startColumn + i);
            }
        }
        return;
    }
}
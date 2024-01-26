public class L_576_Out_of_Boundary {
    static int ans = 0;
    static int temp = 0;

    public static void main(String[] args) {
        // System.out.println("Final:" + findPaths(1, 3, 2, 0, 0));
        // System.out.println("Final:" + findPaths(2, 2, 2, 0, 0));
        System.out.println("Final:" + findPaths(1, 3, 3, 0, 1));
    }

    static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        for (int i = 1; i <= maxMove; i++) {
            ans = ans - temp;
            fn(m, n, i, startRow, startColumn);
            temp = ans;
        }
        return ans;
    }

    private static void fn(int m, int n, int i, int startRow, int startColumn) {
        if (i > 0) {
            if (startRow - 1 == -1) {
                ans++;
                System.out.println(i + "," + (startRow - 1) + "," + startColumn);
            } else {
                fn(m, n, i - 1, startRow - 1, startColumn);
            }
            if (startRow + 1 == m) {
                ans++;
                System.out.println(i + "," + (startRow + 1) + "," + startColumn);
            } else {
                fn(m, n, i - 1, startRow + 1, startColumn);
            }
            if (startColumn - 1 == -1) {
                ans++;
                System.out.println(i + "," + startRow + "," + (startColumn - 1));
            } else {
                fn(m, n, i - 1, startRow, startColumn - 1);
            }
            if (startColumn + 1 == n) {
                ans++;
                System.out.println(i + "," + startRow + "," + (startColumn + 1));
            } else {
                fn(m, n, i - 1, startRow, startColumn + 1);
            }
        }
        return;
    }
}
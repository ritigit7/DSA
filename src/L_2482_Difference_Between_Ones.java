public class L_2482_Difference_Between_Ones {
    public static void main(String[] args) {
        // int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };
        // int[][] grid = { { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] grid = { { 0 } };

        System.out.println(grid.length + "," + grid[0].length);
        L_2482_Difference_Between_Ones ob = new L_2482_Difference_Between_Ones();
        ob.onesMinusZeros(grid);
    }

    public int[][] onesMinusZeros(int[][] grid) {
        int length = grid.length;
        int col = grid[0].length;
        int[][] ans = new int[length][col];
        if (length == 1 && col == 1) {
            if (grid[0][0] == 0) {
                ans[0][0] = -2;
                return ans;
            } else {
                ans[0][0] = 2;
                return ans;
            }
        } else {
            int i = 0, j = 0;
            int arr[] = new int[col];
            int brr[] = new int[length];
            int sum = 0;
            while (i < length && j < col) {
                if (grid[i][j] == 1) {
                    sum = sum + 1;
                    arr[j] = arr[j] + 1;
                    j++;
                    if (j == col) {
                        j = 0;
                        brr[i] = 2 * sum - col;
                        sum = 0;
                        i++;
                    }
                } else {
                    j++;
                }
            }
            for (int k : brr) {
                System.out.print(k);
            }
            System.out.println();
            int c = 0;
            for (int t : arr) {
                arr[c++] = 2 * t - length;
            }
            for (int t : arr) {
                System.out.print(t);
            }

            for (int k = 0; k < length; k++) {
                for (int k2 = 0; k2 < col; k2++) {
                    ans[k][k2] = brr[k] + arr[k2];
                }
            }
            System.out.println();
            for (int k = 0; k < length; k++) {
                for (int k2 = 0; k2 < col; k2++) {
                    System.out.print(ans[k][k2]);
                }
                System.err.println();
            }

            return ans;
        }
    }
}

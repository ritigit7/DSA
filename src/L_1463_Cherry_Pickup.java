public class L_1463_Cherry_Pickup {

    class Solution {

        public int cherryPickup(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            return helper(grid, 0, 0, cols - 1);
        }

        private int helper(int[][] grid, int currRow, int robotACol, int robotBCol) {

            if (robotACol < 0 || robotBCol < 0 || robotACol >= grid[0].length || robotBCol >= grid[0].length)
                return 0;

            if (currRow == grid.length)
                return 0; // lascurrRow

            int result = 0;
            result += grid[currRow][robotACol];
            result += grid[currRow][robotBCol];

            System.out
                    .println(grid[currRow][robotACol] + "," + grid[currRow][robotBCol] + "," + currRow + ", A"
                            + robotACol + ", B" + robotBCol);

            int max = 0; // DFS for nexcurrRow
            for (int x = robotACol - 1; x <= robotACol + 1; x++) {
                for (int y = robotBCol - 1; y <= robotBCol + 1; y++) {
                    if (x < y) {
                        max = Math.max(max, helper(grid, currRow + 1, x, y));
                    }
                }
            }

            result += max; // add maximum result
            return result;
        }
    }

    public static void main(String[] args) {
        L_1463_Cherry_Pickup.Solution ob = new L_1463_Cherry_Pickup().new Solution();
        System.out.println(ob.cherryPickup(new int[][] { { 3, 1, 1 }, { 2, 5, 1 }, { 1, 5, 5 }, { 2, 1, 1 } }));
    }

}

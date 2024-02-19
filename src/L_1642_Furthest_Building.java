import java.util.PriorityQueue;

public class L_1642_Furthest_Building {
    class Solution {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);
            return 0;
        }
    }

    public static void main(String[] args) {
        L_1642_Furthest_Building.Solution ob = new L_1642_Furthest_Building().new Solution();
        System.out.println(ob.furthestBuilding(new int[] { 4, 2, 7, 6, 9, 14, 12 }, 5, 1));
    }
}

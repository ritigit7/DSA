public class L_70Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    static int climbStairs(int n) {
        int a = 0, b = 1, c, t = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            t = c;
            a = b;
            b = c;
        }
        return t;
    }
}

import java.util.Arrays;

public class L_279_Perfect_Squares {
    public static void main(String[] args) {
        numSquares(12);
    }

    static int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    static int solve(int n, int[] dp) {
        if (n <= 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        int ans = n;
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            ans = Math.min(ans, 1 + solve(n - square, dp));
        }
        return dp[n] = ans;
    }
}

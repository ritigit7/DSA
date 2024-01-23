import java.util.Scanner;

public class CF_Theatre_Square {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int ans = (int) ((Math.ceil((double) n / a)) * (Math.ceil((double) m / a)));
            System.out.println(ans);
        }
    }
}
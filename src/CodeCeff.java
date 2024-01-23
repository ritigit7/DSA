import java.util.Scanner;

public class CodeCeff {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a > b && a > c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public void senond() {
        try (Scanner sc = new Scanner(System.in)) {
            int N, X, D;
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                N = sc.nextInt();
                X = sc.nextInt();
                D = sc.nextInt();
                System.out.println((N / (X * 5) + D));
            }
        }
    }

    public void t_3() {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            long factorial;
            int i, n;
            for (int j = 0; j < number; j++) {
                factorial = 1;
                i = 1;
                n = sc.nextInt();
                if (n == 1) {
                    System.out.println(0);
                    break;
                }
                while (i <= n) {
                    factorial *= i;
                    i++;
                }
                System.out.println(factorial);
            }
        }
    }
}

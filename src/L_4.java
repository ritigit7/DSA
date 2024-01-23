import java.util.Scanner;

public class L_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int t=0;
            while (n > 0) {
                if (n % 2 == 0) {
                    n=n/2;
                }else{
                    n=n-1;
                }
                t++;
            }
            System.out.println(t);
        }
    }
}

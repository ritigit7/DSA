import java.util.Scanner;

public class L_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i = n-1;
            String[] arr = new String[n];
            L_3 ob = new L_3();
            while (n > 0) {
                arr[i--] = ob.val(n--);
            }
            for (String st : arr) {
                System.out.println(st);
            }
        }
    }

    public String val(int n) {
        String st = null;
        if (n % 3 == 0 && n % 5 == 0) {
            st = "FizzBuzz";
        } else if (n % 3 == 0) {
            st = "Fizz";
        } else if (n % 5 == 0) {
            st = "Buzz";
        } else {
            st = Integer.toString(n);
        }
        return st;
    }
}

public class L_9_Palindrome_Number {
    public static void main(String[] args) {
        L_9_Palindrome_Number ob = new L_9_Palindrome_Number();
        System.out.println(ob.isPalindrome(212));
    }

    public boolean isPalindrome(int x) {
        int t = x;
        if (x < 0) {
            return false;
        } else {
            int rev = 0;
            while (x != 0) {
                rev = rev * 10 + (x % 10);
                x = x / 10;
            }
            System.out.println(rev);
            if (rev == t) {
                return true;
            } else {
                return false;
            }
        }
    }
}

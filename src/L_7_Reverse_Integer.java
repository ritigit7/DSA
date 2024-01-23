public class L_7_Reverse_Integer {
    public int reverse(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
        }
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        L_7_Reverse_Integer ob = new L_7_Reverse_Integer();
        System.out.println(ob.reverse(2147483641));
    }
}

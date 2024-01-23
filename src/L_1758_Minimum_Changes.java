public class L_1758_Minimum_Changes {
    public static void main(String[] args) {
        L_1758_Minimum_Changes ob = new L_1758_Minimum_Changes();
        // System.out.println(ob.minOperations("0100"));
        // System.out.println(ob.minOperations("10010100"));
        System.out.println(ob.minOperations("101101111"));
        // System.out.println(ob.minOperations("10"));
        // System.out.println(ob.minOperations("1111"));
        // System.out.println(ob.minOperations("110010"));
    }

    public int minOperations(String s) {
        int len = s.length();
        int t = 0;
        int k = 0;
        char[] arr1 = new char[len];
        char[] arr2 = new char[len];
        for (int i = 0; i < len; i = i + 2) {
            arr1[i] = '1';
            arr2[i] = '0';
        }
        for (int i = 1; i < len; i = i + 2) {
            arr1[i] = '0';
            arr2[i] = '1';
        }

        for (int i = 0; i < len; i++) {
            if (arr1[i] != s.charAt(i)) {
                t++;
            }
            if (arr2[i] != s.charAt(i)) {
                k++;
            }
        }
        System.out.println(t + "," + k);
        if (t < k) {
            return t;
        } else {
            return k;
        }
    }
}
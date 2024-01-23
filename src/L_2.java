public class L_2 {
    public static void main(String[] args) {
        int[][] arr = { { 7, 1, 2 }, { 2, 8, 7 }, { 1, 9, 3 } };
        int ans = 0;
        L_2 mx = new L_2();
        for (int[] i : arr) {
            ans=mx.maximum((i[0] + i[1] + i[2]), ans);
        }
        System.out.println(ans);
    }

    public int maximum(int i, int an) {
        int max = an;
        if (i > max) {
            max = i;
        }
        return max;
    }
}

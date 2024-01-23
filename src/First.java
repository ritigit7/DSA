public class First {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 7, 4, 5 };
        int t = 0;
        System.out.println(arr);
        for (int i : arr) {
            arr[t++] = i;
        }
        System.out.print(arr[1]);
    }
}

public class L_1 {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 7, 4, 5 };
        int t = 0;
        int k = 0;
        for (int i : arr) {
            arr[t++] = i+k;
            k=arr[t-1];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

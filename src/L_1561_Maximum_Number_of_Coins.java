import java.util.Arrays;

public class L_1561_Maximum_Number_of_Coins {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 1, 2, 3, 4 };
        // int[] arr = { 2,4,1,2,7,8};
        // int[] arr = { 2,4,5};
        L_1561_Maximum_Number_of_Coins ob = new L_1561_Maximum_Number_of_Coins();
        System.out.println(ob.maxCoins(arr));
    }

    public int maxCoins(int[] piles) {
        int len = piles.length;
        int ans = 0;
        // mergeSort(piles, 0, len - 1);
        Arrays.sort(piles);
        int tm = len / 3;
        int i = 0;
        int d = len - 2;
        while (i++ < tm) {
            System.out.println(piles[d]);
            ans=ans+piles[d];
            d = d - 2;
        }
        return ans;
    }

    // public static void mergeSort(int[] arr, int left, int right) {
    //     if (left < right) {
    //         int mid = left + (right - left) / 2;
    //         mergeSort(arr, left, mid);
    //         mergeSort(arr, mid + 1, right);
    //         merge(arr, left, mid, right);
    //     }
    // }

    // public static void merge(int[] arr, int left, int mid, int right) {
    //     int[] temp = new int[right - left + 1];

    //     int i = left;
    //     int j = mid + 1;
    //     int k = 0;

    //     while (i <= mid && j <= right) {
    //         if (arr[i] <= arr[j]) {
    //             temp[k] = arr[i];
    //             i++;
    //         } else {
    //             temp[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while (i <= mid) {
    //         temp[k] = arr[i];
    //         i++;
    //         k++;
    //     }
    //     while (j <= right) {
    //         temp[k] = arr[j];
    //         j++;
    //         k++;
    //     }
    //     System.arraycopy(temp, 0, arr, left, right - left + 1);
    // }
}

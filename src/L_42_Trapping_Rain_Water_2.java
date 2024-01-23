import java.util.Arrays;

public class L_42_Trapping_Rain_Water_2 {
    public static void main(String[] args) {
        // int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int[] array = { 4,2,0,3,2,5 };
        // int[] array = { 0, 1, 2, 1, 3, 5, 0, 2 };
        int[] array = { 1, 2, 5, 3, 1, 0, 2 };
        int length = array.length - 1;
        int start = 0;
        int end = 0;
        int Total = 0;
        L_42_Trapping_Rain_Water_2 ob = new L_42_Trapping_Rain_Water_2();
        while (end != length) {
            if (array[start] == 0) {
                start = start + 1;
                end = end + 1;
            } else {
                while (array[start] >= array[end]) {
                    if (end == length) {
                        end = length;
                        break;
                    } else {
                        end = end + 1;
                    }
                }
            }
            if (array[start] > array[end]) {
                System.out.println(start + "," + end + "," + Total);
                System.out.println(ob.max(array, start + 1, end));
                int mm = ob.max(array, start + 1, end);
                int[] copied = Arrays.copyOfRange(array, start, end + 1);
                int[] temparr = new int[copied.length];
                System.out.println(copied[0]);
                temparr[0] = mm;
                for (int d = 1; d < copied.length; d++) {
                    temparr[d] = copied[d];
                }
                System.out.println(temparr[0]);
                if (temparr[0] > ob.max(temparr, 1, temparr.length)) {
                    main(args);
                } else {
                    Total = Total + ob.task(temparr, 0, temparr.length - 1);
                }
                

            } else {
                Total = Total + ob.task(array, start, end);
                System.out.println(start + "," + end + "," + Total);
                start = end;
            }
        }
        System.out.println(Total);
    }

    public int task(int[] array, int start, int end) {
        int[] copiedArray = Arrays.copyOf(array, array.length);

        int answer = 0;
        int i = start;
        while (i < end) {
            answer = answer + (copiedArray[start] - copiedArray[i]);
            i = i + 1;
        }
        return answer;
    }

    public int max(int[] array, int start, int end) {
        int[] copied = Arrays.copyOfRange(array, start, end + 1);
        int m = Arrays.stream(copied).max().getAsInt();
        return m;
    }

    // public void greater(int[] array, int start, int end,int Total) {
    // L_42_Trapping_Rain_Water_2 ob = new L_42_Trapping_Rain_Water_2();
    // if (array[start] > array[end]) {
    // System.out.println(start + "," + end + "," + Total);
    // System.out.println(ob.max(array, start + 1, end));
    // int mm = ob.max(array, start + 1, end);
    // int[] copied = Arrays.copyOfRange(array, start, end + 1);
    // int[] temparr = new int[copied.length];
    // System.out.println(copied[0]);
    // temparr[0] = mm;
    // for (int d = 1; d < copied.length; d++) {
    // temparr[d] = copied[d];
    // }
    // System.out.println(temparr[0]);
    // Total = Total + ob.task(temparr, 0, temparr.length - 1);

    // } else {
    // Total = Total + ob.task(array, start, end);
    // System.out.println(start + "," + end + "," + Total);
    // start = end;
    // }
    // }
}
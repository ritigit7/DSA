import java.util.ArrayList;
import java.util.List;

public class L_1291_Sequential_Digits {
    public static void main(String[] args) {
        // System.out.println(sequentialDigits(100, 300));
        System.out.println(sequentialDigits(1000, 13000));
        // System.out.println(sequentialDigits(10, 1000000000));
        // System.out.println(sequentialDigits(58, 155));
    }

    static List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> aList = new ArrayList<>();
        int digitCount = (int) (Math.log10(low));
        int digitCount2 = (int) (Math.log10(high));
        int start = (int) (low / Math.pow(10, digitCount));
        // start = start * 10 + (start + 1);
        // int q = 1;
        // int start = 0;
        // while (q < ) {
        // start = q;
        // q = q * 10 + (q % 10 + 1);
        // }
        int t = 0, ele = 1, one = 1;
        while (t < digitCount) {
            one = one * 10 + (one % 10 + 1);
            ele = (ele * 10) + 1;
            t++;
        }
        System.out.println(start + "," + ele + "," + digitCount2 + "," + one);

        if (start < low) {
            start = start + ele;
        }
        int ptr = start;
        int temp2 = one;
        while (start <= ptr && ptr <= high) {
            aList.add(ptr);
            ptr = ptr + ele;
            if (ptr % 10 == 9) {
                aList.add(ptr);
                ptr = (temp2 * 10) + (temp2 % 10 + 1);
                temp2 = ptr;
                ele = ele * 10 + 1;
                if ((int) (Math.log10(ptr)) == digitCount2 - 1) {
                    aList.add(ptr);
                    break;
                }
            }
        }

        // int digitCount = (int) (Math.log10(low));
        // int digitCount2 = (int) (Math.log10(high));
        // int firstDigit = (int) (low / Math.pow(10, digitCount));

        // System.out.println(firstDigit + "," + digitCount + "," + digitCount2);
        // int first = firstDigit;
        // int temp = firstDigit;
        // int t = 0;
        // while (t < digitCount) {
        // first = first * 10 + (++temp);
        // t++;
        // }
        // int ele = 1;
        // t = 0;
        // while (t < digitCount) {
        // ele = (ele * 10) + 1;
        // t++;
        // }
        // System.out.println(ele);
        // System.out.println(first);
        // int temp2 = first;
        // while (first < high) {
        // if (first > low) {
        // aList.add(first);
        // }
        // first = first + ele;
        // if (first % 10 == 9) {
        // aList.add(first);
        // first = (temp2 * 10) + (temp2 % 10 + 1);
        // temp2 = first;
        // ele = ele * 10 + 1;
        // if ((int) (Math.log10(first)) == digitCount2 - 1) {
        // aList.add(first);
        // break;
        // }
        // }
        // }

        return aList;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L_1630_Arithmetic_Subarrays {
    public static void main(String[] args) {
        // int[] nums = { 4, 6, 5, 9, 3, 7 };
        // int[] l = { 0, 0, 2 };
        // int[] r = { 2, 3, 5 };
        int[] nums = { -12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,1,6,4,8,7 };
        int[] r = { 4,4,9,7,9,10};
        
        L_1630_Arithmetic_Subarrays ob = new L_1630_Arithmetic_Subarrays();
        System.out.println(ob.checkArithmeticSubarrays(nums, l, r));
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> lst = new ArrayList<>();
        ArrayList<Integer> aList = new ArrayList<>();
        int t = 0;
        int i = l[0];
        int en = r[0];
        while (i <= en) {
            System.out.print(i);
            aList.add(nums[i]);
            if (i == en) {
                Collections.sort(aList);
                System.out.println(aList);
                L_1630_Arithmetic_Subarrays o = new L_1630_Arithmetic_Subarrays();
                lst.add(o.check(aList));
                aList.clear();
            }
            if (i == en && t < l.length - 1) {
                t++;
                i = l[t];
                en = r[t];
                System.out.println(i + "," + en);
                i--;
            }
            i++;
        }
        return lst;
    }

    public boolean check(ArrayList<Integer> a) {
        int i = 0;
        int len = a.size();
        int an = a.get(i + 1) - a.get(i);
        i++;
        while (i < len - 1 && a.get(i + 1) - a.get(i) == an) {
            i++;
        }
        if (i == len - 1) {
            return true;
        } else {
            return false;
        }
    }
}
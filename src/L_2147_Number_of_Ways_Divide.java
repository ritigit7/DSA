import java.util.ArrayList;

public class L_2147_Number_of_Ways_Divide {
    public static void main(String[] args) {
        L_2147_Number_of_Ways_Divide ob = new L_2147_Number_of_Ways_Divide();
        // String c = "SSPPSPS";
        // String c = "PPSPSP";
        // String c = "S";
        String c = "SPPSSSSPPS";
        System.out.println(ob.numberOfWays(c));

    }

    public int numberOfWays(String corridor) {
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> aList2 = new ArrayList<>();
        int len = corridor.length();
        int ans = 0;
        int i = 0;
        int j = len - 1;
        while (i < len && j > 0) {
            if (corridor.charAt(i) == 'S' && aList.size() < 2) {
                aList.add(i);
            }
            i++;
            if (corridor.charAt(j) == 'S' && aList2.size() < 2) {
                aList2.add(j);
            }
            j--;
        }
        System.out.println(aList + "," + aList2);
        int ln = aList.size();
        if (ln <= 2) {
            if (ln == 2) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if ((aList.get(1) - aList.get(0)) == (aList2.get(1) - aList2.get(0))) {
                return 1;
            }else{
                
            }

        }
        return ans;
    }
}

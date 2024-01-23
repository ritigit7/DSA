import java.util.ArrayList;

public class L_2125_Number_Laser {
    public static void main(String[] args) {
        L_2125_Number_Laser ob = new L_2125_Number_Laser();
        String[] str = { "000", "111", "000" };
        // String[] str = { "011001", "000000", "010100", "001000" };
        System.out.println(ob.numberOfBeams(str));
    }

    public int numberOfBeams(String[] bank) {
        int ans = 0;
        ArrayList<Integer> aList = new ArrayList<>();

        int length = bank.length;
        int len = bank[0].length();
        for (int i = 0; i < length; i++) {
            int t = 0;
            for (int j = 0; j < len; j++) {
                if (bank[i].charAt(j) == '1') {
                    t++;
                }
            }
            if (t != 0) {
                aList.add(t);
            }
        }
        System.out.println(aList);
        int size = aList.size() - 1;
        for (int i = 0; i < size; i++) {
            ans = ans + aList.get(i) * aList.get(i + 1);
        }
        return ans;
    }
}
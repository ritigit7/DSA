import java.util.ArrayList;
// import java.util.Arrays;
import java.util.HashMap;

public class L_12_Integer_to_Roman {
    public static void main(String[] args) {
        L_12_Integer_to_Roman ob = new L_12_Integer_to_Roman();
        // ob.intToRoman(3);
        // ob.intToRoman(58);
        ob.intToRoman(1997);
    }

    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();

        // String s = String.valueOf(num);
        ArrayList<Character> aList=new ArrayList<>();
        aList.add('s');
        aList.add('e');
        aList.add('w');
        aList.add('p');
        System.out.println();

        // int t = num;
        // int a = s.length()-1;
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5,  "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        // int rev = 0;
        // while (num != 0) {
        //     rev = rev * 10 + (num % 10);
        //     num = num / 10;
        // }
        // System.out.println(rev);
        // int k = 0;
        // while (t != 0) {
        //     k = (t % 10) * (int) (Math.pow(10, a--));
        //     t = t / 10;
        //     System.out.println(k);
        //     // System.out.println(map.get(rev));
        // }

        
        return "a";
    }
}

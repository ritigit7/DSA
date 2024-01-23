import java.util.ArrayList;

public class L_1704_Determine {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
    }

    static boolean halvesAreAlike(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        arrayList.add('e');
        arrayList.add('i');
        arrayList.add('o');
        arrayList.add('u');
        arrayList.add('A');
        arrayList.add('E');
        arrayList.add('I');
        arrayList.add('O');
        arrayList.add('U');

        int len = s.length();
        int t = 0;
        int k = 0;
        for (int i = 0; i < len / 2; i++) {
            if (arrayList.contains(s.charAt(i))) {
                t++;
                System.out.println(s.charAt(i));
            }
        }
        for (int i = len / 2; i < len; i++) {
            if (arrayList.contains(s.charAt(i))) {
                k++;
                System.out.println(s.charAt(i));
            }
        }
        System.out.println(t + "," + k);
        if (k == t) {
            return true;
        } else {
            return false;
        }
    }
}

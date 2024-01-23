import java.util.HashMap;

public class L_13_Roman_to_Integer {
    public static void main(String[] args) {
        L_13_Roman_to_Integer ob = new L_13_Roman_to_Integer();
        ob.romanToInt("MCMXCIV");
        ob.romanToInt("MMDXLVII");
        ob.romanToInt("MMMCCXLI");
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int i = 0;
        int roman = 0;
        while (i < len) {
            if (i != len - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                roman = roman + (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
                i = i + 2;
            } else {
                roman = roman + map.get(s.charAt(i));
                i++;
            }
        }
        System.out.println(roman);
        return roman;
    }
}

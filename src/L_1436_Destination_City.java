import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class L_1436_Destination_City {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        // paths.add(new ArrayList<>(Arrays.asList("B", "C")));
        // paths.add(new ArrayList<>(Arrays.asList("D", "B")));
        // paths.add(new ArrayList<>(Arrays.asList("C", "A")));

        // paths.add(new ArrayList<>(Arrays.asList("London", "New York")));
        // paths.add(new ArrayList<>(Arrays.asList("New York", "Lima")));
        // paths.add(new ArrayList<>(Arrays.asList("Lima", "Sao Paulo")));

        paths.add(new ArrayList<>(Arrays.asList("pYyNGfBYbm", "wxAscRuzOl")));
        paths.add(new ArrayList<>(Arrays.asList("kzwEQHfwce", "pYyNGfBYbm")));

        System.out.println(paths);
        L_1436_Destination_City ob = new L_1436_Destination_City();
        System.out.println(ob.destCity(paths));

    }

    public String destCity(List<List<String>> paths) {
        String str = "";
        HashMap<String, Boolean> map = new HashMap<>();

        for (List<String> list : paths) {
            String s = list.get(1);
            map.put(s, rn(paths, s));
            if (rn(paths, s) == false) {
                System.out.println(list.get(1));
                str = list.get(1);
                // break;
            }
        }
        System.out.println(map);
        return str;
    }

    private Boolean rn(List<List<String>> paths, String s) {
        boolean b = true;
        for (List<String> list : paths) {
            if (list.get(0) == s) {
                b = true;
                break;
            } else {
                b = false;
            }
        }
        return b;
    }
    // public String destCity(List<List<String>> paths) {
    // String str = "";
    // String st = "";
    // for (List<String> list : paths) {
    // System.out.println(list.get(1));
    // st = list.get(1);
    // int n = 0;
    // for (List<String> lisr : paths) {
    // if (lisr.get(0) == st || lisr.get(1) == st) {
    // n++;
    // }
    // }
    // System.out.println(n);
    // if (n == 1) {
    // str = list.get(1);
    // }
    // }
    // return str;
    // }

}

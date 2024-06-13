
// import java.util.Arrays;
// import java.util.Arrays;
// import java.util.stream.IntStream;

// import java.util.Scanner;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Map;
// import java.util.TreeMap;
// import java.util.HashMap;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp {
    static int findPlatform(int arr[], int dep[], int n) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(dep[i], arr[i]);
        }
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        int count = 0;
        int temp;
        int len = 0;
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            if (len > 0) {
                if (sortedMap.get(entry) < temp) {
                    count++;
                }
            }
            temp = entry;
            len++;
        }
        return count;

    }

    public static void main(String[] args) {
        List<String> liveMatches = fetchLiveMatches();

        for (String match : liveMatches) {
            System.out.println(match);
        }
    }

    public static List<String> fetchLiveMatches() {
        List<String> liveMatches = new ArrayList<>();
        HttpURLConnection connection = null;
        BufferedReader reader = null;

        try {
            URL url = new URL("https://www.cricbuzz.com/cricket-match/live-scores");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            StringBuilder response = new StringBuilder();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // Regular expression to extract live match information
            String regex = "<div class=\"cb-scr-wll-chvrn cb-lv-scrs-col\">(.*?)</div>";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(response.toString());

            while (matcher.find()) {
                String match = matcher.group(1).trim();
                liveMatches.add(match);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                connection.disconnect();
            }
        }

        return liveMatches;
    }
    // public static void main(String[] args) {

    // char[] c = new char[5];
    // System.out.println(c[0]);
    // String str = "WWEQERQWQWWRWWERQWEQ";
    // System.out.println(str.length());
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < str.length(); i++) {
    // map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    // }
    // System.out.println(map);
    // int t = 0;
    // for (int i : map.values()) {
    // if (i > str.length() / 4) {
    // System.out.println(i);
    // t = t + (i - str.length() / 4);
    // }
    // }
    // System.out.println(t);
    // }
    // HashMap<Integer, Integer> map = new HashMap<>();
    // map.put(1, null);
    // map.put(3, null);
    // map.put(2, null);
    // System.out.println(map);

    // int[][] matrix = { { 2, 1 }, { 6, 5 }, { 7, 8 } };
    // t = 5;
    // System.out.println(t);
    // System.out.println(matrix[0].length);

    // static Map<Character, Integer> minSteps(String s, String t) {
    // Map<Character, Integer> list1 = new HashMap<>();
    // Map<Character, Integer> list2 = new HashMap<>();
    // for (int i = 0; i < s.length(); i++) {
    // list1.put(s.charAt(i), list1.getOrDefault(s.charAt(i), 0) + 1);
    // list2.put(t.charAt(i), list2.getOrDefault(t.charAt(i), 0) + 1);
    // }
    // for (Character key : list2.keySet()) {
    // if (list1.containsKey(key)) {
    // list1.put(key, Math.abs(list1.get(key) - list2.get(key)));
    // }
    // }
    // int steps = 0;
    // for (Character key : list1.keySet()) {
    // steps = steps + list1.get(key);
    // }
    // return list1;
    // }

    // int a = 'a';
    // int e = 'e';
    // int i = 'i';
    // int o = 'o';
    // int u = 'u';
    // int A = 'A';
    // int E = 'E';
    // int I = 'I';
    // int O = 'O';
    // int U = 'U';
    // System.out.println(
    // a + "," + e + "," + i + "," + o + "," + u + "," + A + "," + E + "," + I + ","
    // + O + "," + U);
    // ArrayList<Character> arrayList = new ArrayList<>();
    // arrayList.add('a');
    // arrayList.add('e');
    // arrayList.add('i');
    // arrayList.add('o');
    // arrayList.add('u');
    // arrayList.add('A');
    // arrayList.add('E');
    // arrayList.add('I');
    // arrayList.add('O');
    // arrayList.add('U');

    // Scanner sc = new Scanner(System.in);
    // int d = sc.nextInt();
    // if (d == 4) {
    // System.out.println("YES");

    // } else {
    // System.out.println("NO");
    // }

    // Scanner sc = new Scanner(System.in);

    // try (Scanner sc = new Scanner(System.in)) {
    // int t = sc.nextInt();
    // for (int i = 0; i < t; i++) {
    // int a = sc.nextInt();
    // if (a > 3) {
    // if (a % 2 == 0) {
    // System.out.print(((3 * a) / 2) - 3);
    // } else {
    // System.out.print(((3 * a) / 2) - 2);
    // }
    // } else {
    // System.out.print(0);
    // }
    // }
    // }

    // int[] ar=new int[5];
    // Temp obTemp=new Temp();
    // obTemp.set(ar);
    // for (int i : ar) {
    // System.out.println(i);
    // }
    // IntStream stream = IntStream.range(1, 11);
    // System.out.println(stream.max().getAsInt());
    // for (int i : IntStream.range(1, 11)) {
    // System.out.println(i);
    // }

    // IntStream st = IntStream.range(1, 11);
    // for (int t : st.toArray()) {
    // System.out.println(t);
    // }
    // int i = 0;
    // while (i < 10) {
    // if (i == 3) {
    // i++;
    // continue;
    // }
    // System.out.println(i);
    // i++;
    // }
    // }
    // public void set(int[] a)
    // {
    // a[0]=1;
    // }
    // int[] originalArray = { 1, 2, 3, 4, 5 };
    // int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
    // copiedArray[3]=9;
    // System.out.println(copiedArray[3]);
    // System.out.println(originalArray[3]);

    // int[] ar={1,0,8,7,4,5,3,6,3,2,1};
    // int[] copied = Arrays.copyOfRange(ar, 4, 8);
    // int max = Arrays.stream(copied).max().getAsInt();
    // System.out.println(ar);

    // int[] originalArray = { 1, 2, 3, 4, 5 };
    // int val=9;
    // originalArray[2]=val;
    // System.out.println(originalArray[2]);

    // int nextInteger = (int) Math.ceil(7);

    // System.out.println("Original Float Value: " + 7);
    // System.out.println("Next Greater Integer Value: " + nextInteger);

    // TreeMap<String, Integer> treeMap = new TreeMap<>();
    // treeMap.put("key0", 30);
    // treeMap.put("key1", 10);
    // treeMap.put("key1", 10);
    // treeMap.put("key2", 20);

    // for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
    // System.out.println(entry.getKey() + ": " + entry.getValue());
    // }
    // System.out.println(treeMap);

    // ArrayList<Integer> array = new ArrayList<>();
    // array.add(null);
    // array.add(5);
    // array.add(7);
    // int min = array.get(0);
    // for (int i = 1; i < array.size(); i++) {
    // if (array.get(i) == null) {
    // continue;
    // }
    // if (array.get(i) < min) {
    // min = array.get(i);
    // }
    // }
    // System.out.println(min);
    // System.out.println(Collections.min(array));

    // HashMap<Integer,Integer> ob=new HashMap<>();
    // ob.put(1, 5);
    // System.out.println(ob.containsKey(1));
    // int p1 = 0;
    // int p2 = 0;
    // int t = 0;
    // int[] nums1 = { 1, 2 };
    // int[] nums2 = { 3, 4 };
    // int[] nums1 = { 1,2,9, 13,15 };
    // int[] nums2 = { 3,5,10,12 };
    // int l1 = nums1.length;
    // int l2 = nums2.length;
    // int[] array = new int[l1 + l2];
    // while (p1 < l1 && p2 < l2) {
    // if (nums1[p1] < nums2[p2]) {
    // array[t++] = nums1[p1];
    // p1++;
    // } else {
    // array[t++] = nums2[p2];
    // p2++;
    // }
    // }
    // if (p1 == l1) {
    // while (p2 < l2) {
    // array[t++] = nums2[p2];
    // p2++;
    // }
    // }
    // if (p2 == l2) {
    // while (p1 < l1) {
    // array[t++] = nums1[p1];
    // p1++;
    // }
    // }
    // for (int i : array) {
    // System.out.println(i);
    // }

    // char[] str={'z','s','r','t'};
    // System.out.println(str);

    // String s = String.valueOf(10);
    // System.out.println(s.length());

    // int[] ar={1,7,5,6,8};
    // System.out.println(ar);

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
}

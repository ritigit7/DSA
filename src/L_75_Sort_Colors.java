import java.util.HashMap;
import java.util.TreeMap;

public class L_75_Sort_Colors {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);
        int i = 0;
        for (int key : treeMap.keySet()) {
            for (int j = 0; j < treeMap.get(key); j++) {
                nums[i++] = key;
            }
        }
    }

    public static void main(String[] args) {
        L_75_Sort_Colors solution = new L_75_Sort_Colors();
        int[] nums = { 3, 0, 2, 1, 1, 0 };
        solution.sortColors(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}

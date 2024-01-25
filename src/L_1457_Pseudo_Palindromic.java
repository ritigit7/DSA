import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class L_1457_Pseudo_Palindromic {
    public static void main(String[] args) {

    }

    static int ans = 0;
    static ArrayList<Integer> sub = new ArrayList<>();

    static int pseudoPalindromicPaths(TreeNode root) {
        fn(root);
        int temp = ans;
        ans = 0;
        return temp;
    }

    static int fn(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            sub.add(root.val);
            if (root.left == null && root.right == null) {
                System.out.println(sub);
                fn2(sub);

            } else {
                fn(root.left);
                fn(root.right);
            }
            sub.remove(sub.size() - 1);
            return 0;
        }
    }

    static void fn2(ArrayList<Integer> sub) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int wrong = 0;
        for (int i : sub) {
            map.put(i, fn3(sub, i));
        }
        System.out.println(map);
        for (int q : map.values()) {
            if (q % 2 != 0) {
                wrong++;
            }
        }
        if (wrong == 1 && sub.size() > 2 || sub.size() == 1) {
            ans++;
        }
        System.out.println(wrong);
    }

    static int fn3(ArrayList<Integer> sub, int i) {
        int t = 0;
        for (int a : sub) {
            if (a == i) {
                t++;
            }
        }
        return t;
    }
}

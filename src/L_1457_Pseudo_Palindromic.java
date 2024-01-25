import java.util.ArrayList;

public class L_1457_Pseudo_Palindromic {
    public static void main(String[] args) {

    }

    static ArrayList<ArrayList<Integer>> aList = new ArrayList<>();
    static ArrayList<Integer> sub = new ArrayList<>();

    static int pseudoPalindromicPaths(TreeNode root) {
        fn(root);
        System.out.println(aList);
        return 0;
    }

    static int fn(TreeNode root) {
        if (root == null) {
            return 0;
        } else
            sub.add(root.val);
        {
            if (root.left == null && root.right == null) {
                aList.add(sub);
                System.out.println(sub);

            } else {
                fn(root.left);
                fn(root.right);
            }
            if (sub.size() - 1 > 0)
                sub.remove(sub.size() - 1);
            return 0;
        }
    }
}

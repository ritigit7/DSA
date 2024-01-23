import java.util.ArrayList;

public class L_938_Range_Sum_of_BST {
    static int sum = 0;
    static ArrayList<Integer> aList = new ArrayList<>();
    static ArrayList<Integer> aList2 = new ArrayList<>();

    public static void main(String[] args) {

    }

    static int rangeSumBST(TreeNode root, int low, int high) {
        if (root != null) {
            if (root.val >= low && root.val <= high) {
                System.out.println(root.val);
                sum = sum + root.val;
            }
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }

    static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> t1 = r1(root1);
        ArrayList<Integer> t2 = r2(root2);
        System.out.println(t1);
        System.out.println(t2);
        for (int i = 0; i < t1.size(); i++) {
            if (t1.get(i) == t2.get(i)) {
                continue;
            } else {
                return false;
            }
        }
        return false;
    }

    static ArrayList<Integer> r1(TreeNode root1) {
        if (root1.left != null && root1.right != null) {
            r1(root1.left);
            r1(root1.right);
        } else {
            System.out.println(root1.val);
            aList.add(root1.val);
        }
        return aList;
    }

    static ArrayList<Integer> r2(TreeNode root2) {
        if (root2.left != null && root2.right != null) {
            r2(root2.left);
            r2(root2.right);
        } else {
            System.out.println(root2.val);
            aList2.add(root2.val);
        }
        return aList2;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
import java.util.ArrayList;

public class L_32_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        // String s = "(()";
        String s = ")()())";
        // String s = "()(()";
        // String s = "()(())";
        // String s = ")(";
        // String s = "";
        L_32_Longest_Valid_Parentheses ob = new L_32_Longest_Valid_Parentheses();
        System.out.println(ob.longestValidParentheses(s));

    }

    public int longestValidParentheses(String s) {
        int top = 0;
        int i = 0;
        int ans = 0;
        int len = s.length();
        ArrayList<Character> stack = new ArrayList<>();
        ArrayList<Integer> istack = new ArrayList<>();
        int max = 0;
        int t;
        while (i < len) {
            stack.add(s.charAt(i));
            istack.add(i);
            if (top > 0 && stack.get(top) == ')' && stack.get(top - 1) == '(') {
                ans = ans + 2;
                stack.remove(top);
                stack.remove(top - 1);
                t = istack.get(top) - istack.get(top - 1);
                if (t > max) {
                    max = t;
                }
                System.out.println(istack.get(top - 1) + "," + istack.get(top));
                istack.remove(top);
                istack.remove(top - 1);
                top = top - 2;
            }
            i++;
            top++;
        }
        return max+1;
    }
}

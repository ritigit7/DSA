public class L_791_Custom_Sort_String {
    class Solution {
        public static String customSortString(String order, String s) {
            int[] arr = new int[26];
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < order.length(); i++) {
                arr[order.charAt(i) - 97] = 1;
            }
            for (int i = 0; i < s.length(); i++) {
                if (arr[s.charAt(i) - 97] >= 1) {
                    arr[s.charAt(i) - 97]++;
                } else {
                    arr[s.charAt(i) - 97] = 1;
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i : order.toCharArray()) {
                if (arr[i - 97] == 2) {
                    sb.append((char) i);
                } else {
                    while (arr[i - 97] >1) {
                        sb.append((char) i);
                        arr[i-97]--;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                while (arr[i]>=0) {
                    
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(sb);
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution.customSortString("cba", "abcd");
        // Solution.customSortString("kqep", "pekeq");
    }
}

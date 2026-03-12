import java.util.*;
class TwoStackQue {
    static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }
    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count;
        }
        if (a.length == 0 || b.length == 0) {
            return count;
        }
        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
        return Math.max(ans1, ans2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = s.nextInt();
            }
            System.out.println(twoStacks(x, a, b));
        }
    }
}
//optimal solution , where we takes element from array 1 until limit reached
//import java.util.*;
//
//public class TwoStacksOptimal {
//    static int twoStacks(int x, int[] a, int[] b) {
//        int sum = 0;
//        int count = 0;
//        int i = 0;
//        int j = 0;
//        // take elements from stack A
//        while (i < a.length && sum + a[i] <= x) {
//            sum += a[i];
//            i++;
//        }
//        count = i;
//        // now try taking from stack B
//        while (j < b.length) {
//            sum += b[j];
//            j++;
//            // if sum exceeds limit, remove from A
//            while (sum > x && i > 0) {
//                i--;
//                sum -= a[i];
//            }
//            if (sum > x) {
//                break;
//            }
//            count = Math.max(count, i + j);
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int[] a = {4, 2, 4, 6, 1};
//        int[] b = {2, 1, 8, 5};
//        int x = 10;
//        System.out.println(twoStacks(x, a, b));
//    }
//}
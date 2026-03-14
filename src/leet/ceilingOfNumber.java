package leet;
public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        // jo sawal leetcode me hai usme -1 , return nahi ho sakta but if we apply this if cond then it might return
        // -1 , so this if condition is removed for the leet question...
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
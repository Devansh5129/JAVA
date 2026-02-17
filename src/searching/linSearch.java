package searching;

public class linSearch {
    public static void main(String[] args) {
        int[] nums = {21, 12, 28, 35, 49, 42};
        int target = 28;
        int ans = linSearch(nums, target);
        System.out.println(ans);
    }

    static int linSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1; // if not found
    }
}

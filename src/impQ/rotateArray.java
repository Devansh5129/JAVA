import java.util.Arrays;

class rotateArray {
    // Left rotate by 1 (Using an extra array)
    public static int[] rotateLeft(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = arr[i + 1];
        }
        result[n - 1] = arr[0];
        return result;
    }

    // In-place Left Rotate by 1 (brute method)
    public static int[] rotate(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int temp = arr[0];
        int n = arr.length;

        // Shift elements to the left
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp; // Put first element at the end
        return arr;
    }

    // Left rotate by K steps
    public static int[] rotatingfKSteps(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }
        return result;
    }
    //less-complexity..interview time - O(2n)-not that much better but no extra space so space - O(1)...

        public void rotatey(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            reverse(nums, 0, n - 1);      // step 1
            reverse(nums, 0, k - 1);      // step 2
            reverse(nums, k, n - 1);      // step 3
        }
        public void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 1. Test rotateLeft
        int[] rotatedLeft = rotateLeft(arr1);
        System.out.println("Rotated Left by 1 (New Array): " + Arrays.toString(rotatedLeft));

        // 2. Test rotatingfKSteps
        int[] rotatedK = rotatingfKSteps(arr1, 3);
        System.out.println("Rotated Left by 3 Steps: " + Arrays.toString(rotatedK));

        // 3. Test in-place rotate (modifies the original arr1)
        int[] rotatedInPlace = rotate(arr1);
        System.out.println("Rotated Left In-Place (Modifies Original): " + Arrays.toString(rotatedInPlace));
        int [] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr)));
    }
}

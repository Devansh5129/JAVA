class rotateArray {
    // function to rotate array left by 1
    public static int[] rotateLeft(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        // shift elements
        for (int i = 0; i < n - 1; i++) {
            result[i] = arr[i + 1];
        }
        // put first element at last
        result[n - 1] = arr[0];
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // call function
        int[] rotated = rotateLeft(arr);
        // print result
        System.out.print("Rotated array: ");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
package searching;

public class rotationTimes {
    static void main(String[] args) {
        int []arr={};
        System.out.println(findKRotation(arr));
    }
    //same as minimumRotatedArray
    public static int findKRotation(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high) {
            // Entire range sorted
            if(arr[low] <= arr[high]) {
                if(arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                break;
            }
            int mid = low + (high - low) / 2;
            // Left half sorted
            if(arr[low] <= arr[mid]) {
                if(arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            // Right half sorted
            else {
                if(arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}

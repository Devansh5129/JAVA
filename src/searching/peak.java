package searching;

public class peak {
    static void main(String[] args) {
        int[] arr={1,2,3,5,4,6,7};
        System.out.println(findPeakElement(arr));
    }//basbaju wale check karte jana hai
    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
    }


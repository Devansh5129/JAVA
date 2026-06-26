package searching;

public class minimumRotatedSortedarray {
    static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    //apne ko simply sorted half dkhne hai isme sorted array me jo minimum hai wo return hoga
    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            // Entire range sorted
            if(arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }
            //jis half me bhi sorted numbers ho usme chcek karke sirf minimum dekhkar usko store karte jana hai jab bhi
            // minimum mile  vo return hoga
            int mid = low + (high - low) / 2;
            // Left half sorted
            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            // Right half sorted
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }
}

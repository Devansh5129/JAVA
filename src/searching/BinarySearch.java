package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={2,3,4,6,10,12,15,17,19,20};
        int target =19;
        int ans= binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end =arr.length-1;
        while(start <= end){
            // int mid= (start+end)/2; //might give wrong answer for larger valuesi
            int mid=start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;

            }

        }
        return -1;


    }
}

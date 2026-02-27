package searching;
//ceiling of number......
// practice question
/* public class BSQus{
    public static void main(String[] args) {
        int [] arr={2,3,4,6,10,12,15,17,19,20};
        int target =16;
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
        return start;


    }
}
*/
//the below code have mistakes
/*public class BSQus{
    public static void main(String[] args) {
        char [] letters={'c','f','g'};
        char target= 'g';
        char ans=nextGreatestLetter (letters,target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[]letters,char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            // int mid= (start+end)/2; //might give wrong answer for larger valuesi
            int mid = start + (end - start) / 2;
            if (letters < letters[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return letters[start% letters.length];
    }
}
*/ /*
// given an array integers nums sorted in ascending order, find
//starting and end pos of a given target value,

public class BSQus {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        //ans should be 1,4
        System.out.println(ans);
    }

    static int searching(int[] arr, int target) {
        int ans = {-1, -1};
        //check for 1st occurence if target first
        int start = 0;
        int end = arr.length - 1;
        while (start <= mid) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans;

    }

    // this functn just returns the index value of target
    static int targetValue(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= mid) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
             ans= mid;
             if(findStartIndex==true){
                 end = mid-1;

             }else{
                 start=end+1;
             }
            }
            return ans;

        }
    }
}
*/
public class BSQue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int target = 4;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {
        //first finding the range
        //1st start with chunk of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            //double the value of chunk
            //end= previous end+sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // int mid= (start+end)/2; //might give wrong answer for larger valuesi
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
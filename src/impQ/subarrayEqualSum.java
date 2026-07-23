package impQ;
import java.util.*;
public class subarrayEqualSum {
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        int [] array ={15,-2,2,-8,1,7,10,23};
       System.out.println("subarray sum equals to zero : " + subArraySumZeroLength(array));

        System.out.println(sum(arr,k));
        System.out.println(longestSubarrayWithSumK(arr,k));
    }
    public static int sum(int [] arr, int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=i; j<arr.length; j++){
                sum=sum+arr[j];
                if(sum == k) {
                    count++;
            }
        }

    }return count;
}

//Why Sliding Window Doesn't Work?
//
//Because array may contain:
//
//[1,-1,1]
//
//Negative numbers can decrease the sum.
//
//Sliding window works only when expanding always increases the sum (e.g., all positive numbers).

//code for positives


    public static int longestSubarrayWithSumK(int[] a, long k) {
        int left = 0;
        int right = 0;
        long sum = a[0];
        int maxLen = 0;
        int n = a.length;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += a[right];
            }
        }
        return maxLen;
    }
    //returning the maximum sized subarray whose sum is equals to 0
    public static int subArraySumZeroLength(int [] array){
       Map<Integer, Integer>map = new HashMap<>();
       map.put(0,-1);
       int sum=0;
       int maxLen=0;
       for (int i=0;i<array.length; i++){
           sum +=array[i];
           if(map.containsKey(sum)){
               maxLen=Math.max(maxLen, i-map.get(sum));
           }else{
               map.put(sum,i);
           }
       }
       return maxLen;
    }
}
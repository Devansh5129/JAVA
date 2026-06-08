package impQ;

public class subarrayEqualSum {
    static void main(String[] args) {
        int [] arr={1,2,3};
        int k =3;
        System.out.println(sum(arr,k));
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
}}
//Why Sliding Window Doesn't Work?
//
//Because array may contain:
//
//[1,-1,1]
//
//Negative numbers can decrease the sum.
//
//Sliding window works only when expanding always increases the sum (e.g., all positive numbers).
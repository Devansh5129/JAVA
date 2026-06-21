package searching;

public class UBLB {
    public static int lowerBound(int[] arr,int x){

        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr,int x){

        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}

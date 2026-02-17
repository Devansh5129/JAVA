package searching;

/* public class searchingQ {
    public static void main(String[] args) {
        int [] arr = {12,10,4,8,45,1,3,25};
        System.out.println(min(arr));;

    }
    static int min(int[] arr){
        int ans= arr[0];
        for(int i=0; i< arr.length; i++){
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
*/
public class searchinQ{
    public static void main(String[] args) {
        int [] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int []nums ){
        int count=0;
        for(int num:nums){
            if (even(num)){
                count++;

            }
        }
        return count;
    }
    //functn to check whether a no contains even digits or not
    static boolean even (int num) {
        int numberOfDigits = digits(num);
        if( numberOfDigits%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}


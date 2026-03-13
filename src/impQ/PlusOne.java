package impQ;
import java.util.*;
 public class PlusOne {
public static int[] plusOne(int[] digits) {
    int n = digits.length-1;
    //we had to access the last element so why not we traverse array from last...
    for(int i=digits.length-1; i>0; i--){
        ++digits[i];
        digits[i]%=10;
        if(digits[i]!=0){
            return digits;
        }
    }
    digits = new int[n+1];
    digits[0]=1;
    return digits;
}
public static void main(String[] args){
    int[] digits ={1,2,3};
    System.out.println(Arrays.toString(plusOne(digits)));
}
}
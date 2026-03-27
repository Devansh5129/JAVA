//2 pointer approach
package impQ;
import java.util.*;
public class removeDuplicate {
    static void main(String[] args) {
        int [] arr= {1,1,2,2,3};
        int length= hatao(arr);
        System.out.println(length);
        System.out.println( Arrays.toString(Arrays.copyOf(arr, length)));
        int [] array= {1,1,2,2,3};
        int length1= hatao2(array);
        System.out.println(length1);
        System.out.println( Arrays.toString(Arrays.copyOf(array, length1)));
    }
    static int hatao(int [] arr){
       if(arr.length==0){
           return 0;
       }
       int i =0;
       for(int j=1; j<arr.length; j++){
           if(arr[j] !=arr[i]){
               arr[i]=arr[j];
               i++;
           }
       }
       return i+1;
}
//brute force ...
private static int hatao2(int [] array){
    int n = array.length;
    for(int i=0; i<n-1;i++){
        if(array[i]==array[i+1]){
            for(int j=i+1;j<n-1; j++){
                array[j]=array[j+1];
            }
            n--;
            i--;
        }
    }return n;
}
}
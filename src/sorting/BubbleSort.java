package sorting;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int []arr={55,47,63,92,11};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        //run the steps n-1 times
        for(int i =0; i<arr.length; i++){
            for (int j=1; j<=arr.length -1; j++){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }

            }
        }
    }
}

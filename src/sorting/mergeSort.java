package sorting;

import java.util.Arrays;

public class mergeSort {
   public static void main(String [] args) {
       int [] arr= {4,5,3,6,1,5};
       arr= mergeSorting(arr);
       System.out.println(Arrays.toString(arr));
    }
    static int [] mergeSorting(int[] arr){
       if(arr.length==1){
           return arr;
       }
       int mid= arr.length/2;
       int[] left = mergeSorting(Arrays.copyOfRange(arr,0,mid));
       int[] right = mergeSorting(Arrays.copyOfRange(arr,mid,arr.length));
       return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {
       int [] mix=new int[first.length+second.length];
       int i=0; // jo subarray bani ye uske pointers
       int j=0; // jo apas me check karenge khud ko
       int k=0; // merged array ka pointer hoga ye ...
       while(i<first.length && j< second.length){
           if(first[i]<second[j]){
               mix[k]=first[i];
               i++;
           }else{
               mix[k]=second[j];
               j++;
           }k++;
       }
       //it may be possible that one array is larger and have more
        //elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
            while(j< second.length ){
                mix[k]=second[j];
                j++;
                k++;
        }
        return mix;
    }
    }



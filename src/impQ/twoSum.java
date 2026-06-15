package impQ;

import java.util.*;
//brute force near to O(n^2)
public class twoSum {
    public static int[] twoSum1(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

   public static void main(String[] args) {
        int [] arr={2,6,5,8,11};
       int target=14;
        System.out.println(Arrays.toString(twoSum1(arr,target)));
        System.out.println(Arrays.toString(TwoSum(arr,target)));

    }
    //giving array , itering from start like we get 2 and target is 14
    //so the needed value must be 12 , check in map whether exits or not
//O(N*logN)
    public static int []TwoSum(int [] arr,int target){
    HashMap<Integer, Integer>map=new HashMap<>();
    int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            if(map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(arr[i], i);
        }

        return new int[]{};
    }
}


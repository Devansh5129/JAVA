package hash;

import java.util.*;

public class hashQue {

    public static void majorityElement(int nums[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()) {

            if(map.get(key) > nums.length/3) {
                System.out.println(key);
            }
        }
    }
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length; j++){
            set.add(arr2[j]);
        }
        return set.size();

    }
    public static int intersection(int arr1[],int arr2[]){
        HashSet<Integer>set = new HashSet<>();
        int count =0;
        for (int i=0;i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length; j++){
            if(set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int nums[] = {1,3,2,5,1,3,1,5,1};
        int arr1[]={1,2,3,4,6,5};
        int arr2[]={4,5,1};
        System.out.println(union(arr1,arr2));
        System.out.println(intersection(arr1,arr2));
        union(arr1,arr2);
        intersection(arr1,arr2);
        majorityElement(nums);
    }
}
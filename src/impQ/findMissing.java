package impQ;
import java.util.*;
//brute force approach-- do loops simultaneously ( nested )
// loop i from 0 to n , loop j same 0 to n
//outer loop i=0, first iteration checks the first element with all the elements if found , boolean changes to false and break
//but when seaches for i=2; it will not get in array hence found = false and !found=true and i is returned
//O(n^2) ,O(1)
public class findMissing {
    static void main(String[] args) {
        int [] arr={3,0,1,2,4}; // missing should be ?
        System.out.println("brute : "+missingNumber(arr));
        System.out.println("hashset : "+missingNumber1(arr));
        System.out.println("maths sum formula : " +missingNumber2(arr));
        System.out.println("xor approach : "+ missingNumber3(arr));
    }
    public static int missingNumber(int [] arr){
        int n= arr.length;
        for(int i =0; i<=n;i++){
            boolean found = false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
    //using hashset O(N) , O(1)
        public static int missingNumber1(int[] nums) {
            int n = nums.length;
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                set.add(num);
            }
            for(int i = 0; i <= n; i++) {
                if(!set.contains(i)) {
                    return i;
                }
            }
            return -1;
        }

    //maths approach by finding the sum , O(N),O(1)
    //the sum for n elements in maths is n*(n+1)/2 so we could cal the expected sum from formula then actual sum simply then the difference must be the answer
        public static int missingNumber2(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for(int i = 0; i < n; i++) {
                actualSum += nums[i];
            }
            return expectedSum - actualSum;
        }
        //xor approach--if we xor all numbers from 0 to n add all elements of array, every matching number cancels out...
            public static int missingNumber3(int[] nums) {
                int n = nums.length;
                int xor = n;
                for(int i = 0; i < n; i++) {
                    xor ^= i;
                    xor ^= nums[i];
                }
                return xor;
            }
        }


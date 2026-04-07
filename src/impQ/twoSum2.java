package impQ;

import java.util.Arrays;

class twoSum2 {
    static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }
            else if(sum < target){
                left++;   // sum badhana hai
            }
            else{
                right--;  // sum kam karna hai
            }
        }  return new int []{-1,-1};
    }}

//  return new int[]{left+1, right+1};  <-- this is same as
//  int [] ans=new int [2];
//  ans[0]=i+1;
//  ans[1]-j+1;
//  return ans;
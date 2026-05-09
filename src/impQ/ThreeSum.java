package impQ;
import java.util.*;
public class ThreeSum {
    static void main(String[] args) {
        int [] nums ={-1,0,1,2,-2,5};
        System.out.println(threeSum(nums));
        System.out.println(threeSumm(nums));
    }

    //this os brute force with O(n3) complexity consisting 3 nested loops...
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;

        for (int i=0; i<n-2;i++){
            for(int j=i+1; j<n-1;j++){
                for (int k =j+1; k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=Arrays.asList( nums[i],
                                nums[j],
                                nums[k]
                        );
                        // avoid duplicates manually
                        if (!ans.contains(temp)) {
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;

    }

    //167. Two Sum II - Input Array Is Sorted...

        public int[] twoSum(int[] numbers, int target) {
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
        }

//  return new int[]{left+1, right+1};  <-- this is same as
//  int [] ans=new int [2];
//  ans[0]=i+1;
//  ans[1]-j+1;
//  return ans;


    //better approach-fixed 1 element sum of rest 2
    public static List<List<Integer>> threeSumm(int[] nums){
    Set<List<Integer>> result = new HashSet<>();
     Arrays.sort(nums);
    int n = nums.length;
    //fix one element
     for(int i=0; i<n-2;i++){
        HashSet<Integer>set = new HashSet<>();
        for (int j=i+1;j<n;j++){
            int target = -(nums[i] + nums[j]);

            // if target already seen
            if (set.contains(target)) {

                List<Integer> temp = Arrays.asList(
                        nums[i],
                        target,
                        nums[j]
                );
                Collections.sort(temp);
                result.add(temp);
            }
            set.add(nums[j]);
        }
    }

     return new ArrayList<>(result);

}
}

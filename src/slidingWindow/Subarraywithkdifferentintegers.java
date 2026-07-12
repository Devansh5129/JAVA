package slidingWindow;
import java.util.*;
public class Subarraywithkdifferentintegers {
    static void main(String[] args) {
        int [] nums = {1,2,1,2,3};
        int [] nums1 = {2,1,1,1,3,4,3,2};
        System.out.println("brute force nested loop se :" + subarraysWithKDistinct(nums, 3));
        System.out.println("sliding window se : "+ numSubarraysWithSum(nums1,3));
    }
    public static int subarraysWithKDistinct(int[] nums, int k){
        int n = nums.length;
        int ans=0;
        for(int i=0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j =i; j<n; j++){
                set.add(nums[j]);
                if(set.size() == k)
                    ans++;
                if(set.size() > k)
                    break;
            }
        }
        return ans;
    }
    public static int subarraysWithKDistinct1(int [] nums, int k){
        if(k<0){
            return 0;
        }
        int left =0;
        int count =0;
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int right =0; right<nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left], map.get(nums[left])-1);
                //jabtak poora frequency 0 hoh jaye fir remove kar denge
                if(map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public static int numSubarraysWithSum(int[] nums1, int k) {
        return subarraysWithKDistinct1(nums1, k) - subarraysWithKDistinct1(nums1, k - 1);
    }
}

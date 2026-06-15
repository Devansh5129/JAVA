package impQ;

import java.util.Arrays;
//O(n),O(n)
public class rearrangeElements {
    static void main(String[] args) {
        int [] nums={2,5,-1,7,8,-9,-6,-9};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
        public static int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            int posIndex = 0;
            int negIndex = 1;
            for (int i = 0; i < n; i++) {
                if (nums[i] < 0) {
                    ans[negIndex] = nums[i];
                    negIndex += 2;
                } else {
                    ans[posIndex] = nums[i];
                    posIndex += 2;
                }
            }
            return ans;
        }
    }

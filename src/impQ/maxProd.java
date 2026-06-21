package impQ;

public class maxProd {
    static void main(String[] args) {
        int [] nums = {-4,-2,3,2,0,1,-2,7,9,0,4,3,-1};
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct1(nums));

    }
    //brute force approach O(N^2), O(1).
    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            for(int j = i; j < nums.length; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
    //optimal -- pref and suff prod..

        public static int maxProduct1(int[] nums) {

            int n = nums.length;

            int prefix = 1;
            int suffix = 1;

            int ans = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++) {

                if(prefix == 0) prefix = 1;
                if(suffix == 0) suffix = 1;

                prefix *= nums[i];
                suffix *= nums[n - 1 - i];

                ans = Math.max(ans, Math.max(prefix, suffix));
            }

            return ans;
        }
    }


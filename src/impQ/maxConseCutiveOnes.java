//brute and optimal approaches
class maxConseCutiveOnes {
    static void main(String[] args) {
        int [] nums={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes1(nums,2));
        System.out.println(longestOnes(nums,2));
    }
    public static int longestOnes(int[] nums, int k){
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++) {
            int zeros = 0;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] == 0) {
                    zeros++;
                }
                if(zeros > k) {
                    break;
                }
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
        public static int longestOnes1(int[] nums, int k) {
            int left = 0;
            int zeros = 0;
            int maxLen = 0;
            for(int right = 0; right < nums.length; right++) {
                if(nums[right] == 0) {
                    zeros++;
                }
                while(zeros > k) {
                    if(nums[left] == 0) {
                        zeros--;
                    }
                    left++;
                }
                maxLen = Math.max(maxLen, right-left + 1);
            }
            return maxLen;
        }
    }
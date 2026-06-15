package impQ;

import java.util.Arrays;
//somewhat better , O(NLOGN), o(1)
class longestConsecutiveSequence {
    static void main(String[] args) {
        int [] nums={100,1,101,2,99,3,4,5};
        System.out.println(longestConsecutive(nums));

    }
    //sorted array me iteration start karenge jab pointer kisi ek element pe hoga toh uska last smaller nums[i]-1 se chcek karege ki exits kar raha ki nahi
    //agar nahi toh count as it is aur agar kar raha hia toh counter badhate jayege, last mei longest print ho jayega ...
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int count = 1;


        for(int i = 1; i < n; i++) {
            int lastSmaller= nums[i-1];
            if(nums[i] -1== lastSmaller) {
                count++;
            }
            else if(nums[i] != lastSmaller) {
                count = 1;//do nothing
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
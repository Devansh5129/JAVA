package impQ;
import java.util.*;
class MoveZeroes {
    // optimal solution (2 pointer swapping)
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println("Swapping Method:");
        System.out.println(Arrays.toString(nums));
        // second method
        MoveZeros2(nums);
    }
    // 2nd solution (shift non-zero and fill zero)
    static void MoveZeros2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        System.out.println("Shift Method:");
        System.out.println(Arrays.toString(nums));
    }
}
//To move all zeros to the end while maintaining order,
// the main idea is to shift all non-zero elements to the front of
// the array and allow zeros to naturally move to the end.
// The brute force approach uses an extra array to store non-zero elements
// and then fills the remaining positions with zeros,
// but this uses extra space.
// A better approach directly places non-zero elements at the
// beginning of the original array and then fills the remaining
// positions with zeros, reducing space complexity.
// The optimal approach uses a two-pointer technique where
// one pointer scans the array and the other pointer tracks
// the position for the next non-zero element, swapping elements
// whenever a non-zero is found. This ensures that the order of elements
// is maintained, the operation is done in-place,
// and the time complexity remains O(n) with constant space,
// making it an efficient and commonly used array manipulation
// technique in interviews.
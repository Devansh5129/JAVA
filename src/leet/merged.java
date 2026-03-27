package leet;
import java.util.Arrays;
public class merged {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mix[k] = nums1[i];
                i++;
                k++;
            } else {
                mix[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) mix[k++] = nums1[i++];
        while (j < n) mix[k++] = nums2[j++];
        for (int x = 0; x < m + n; x++) {
            nums1[x] = mix[x];
        }
        return nums1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {4,5,6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
}

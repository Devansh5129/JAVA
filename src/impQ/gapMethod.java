package impQ;

import java.util.Arrays;
public class gapMethod {
        static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
            if (arr1[ind1] > arr2[ind2]) {
                int temp = arr1[ind1];
                arr1[ind1] = arr2[ind2];
                arr2[ind2] = temp;
            }
        }
        static void merge(int[] arr1, int[] arr2, int n, int m) {
            int len = n + m;
            // Initial gap
            int gap = (len / 2) + (len % 2);
            while (gap > 0) {
                int left = 0;
                int right = left + gap;

                while (right < len) {
                    // left in arr1, right in arr2
                    if (left < n && right >= n) {
                        swapIfGreater(arr1, arr2, left, right - n);
                    }
                    // both pointers in arr2
                    else if (left >= n) {

                        swapIfGreater(arr2, arr2, left - n, right - n);
                    }
                    // both pointers in arr1
                    else {
                        swapIfGreater(arr1, arr1, left, right);
                    }
                    left++;
                    right++;
                }
                if (gap == 1)
                    break;
                gap = (gap / 2) + (gap % 2);
            }
        }
        public static void main(String[] args) {
            int[] arr1 = {1, 4, 8, 10};
            int[] arr2 = {2, 3, 9};

            merge(arr1, arr2, arr1.length, arr2.length);
            System.out.println("Array 1 : " + Arrays.toString(arr1));
            System.out.println("Array 2 : " + Arrays.toString(arr2));
        }
    }


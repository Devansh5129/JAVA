package impQ;
import java.util.*;
//this would be the brute force approach comparing the first element with other , if the element occurs twice then repeating
//if no element occurs then missing ...O(N^2),O(1)
public class missingRepeatingInArray{
    public  static void main(String[] args) {
        int [] arr={1,2,3,5,9,8,7,6,7};
        System.out.println("[repeating , missing] -brute  "+Arrays.toString(findMissingRepeating1(arr)));
        System.out.println("[repeating , missing] -freqArray  "+Arrays.toString(findMissingRepeating(arr)));
        System.out.println("[repeating , missing]-optimalMathsFormula  "+Arrays.toString(findMissingRepeating2(arr)));


    }
public static int[] findMissingRepeating1(int[] arr) {

    int n = arr.length;
    int repeating = -1;
    int missing = -1;

    for (int i = 1; i <= n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == i) {
                count++;
            }
        }

        if (count == 2) {
            repeating = i;
        }

        if (count == 0) {
            missing = i;
        }
    }
    return new int[]{repeating, missing};
}
// this is the approach of using an array of frequency and storing the value in it and returning
//O(N) , O(N) {extra space of array used ..


    public static int[] findMissingRepeating(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        for (int num : arr) {
            freq[num]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2)
                repeating = i;
            else if (freq[i] == 0)
                missing = i;
        }

        return new int[]{repeating, missing};
    }
    //optimal -- maths formula just like we calculated missing number with sum of numbers from 1 to n then array sum numbers
    //creating 2 equations becoz we have 2 variables
    public static int[] findMissingRepeating2(int[] arr) {
        int n = arr.length;

        long S1 = 0;
        long S2 = 0;

        for (int num : arr) {
            S1 += num;
            S2 += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
//SQUARE WALI EQN KA
        long expectedSqSum = (long) n * (n + 1) * (2L * n + 1) / 6;
        long diff = S1 - expectedSum; // x - y
        long sqDiff = S2 - expectedSqSum; // x² - y²
        long sum = sqDiff / diff; // x + y
        long repeating = (diff + sum) / 2;
        long missing = sum - repeating;

        return new int[]{(int) repeating, (int) missing};
    }
}

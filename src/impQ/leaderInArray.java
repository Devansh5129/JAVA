package impQ;
import java.util.*;

class leaderInArray {
    static void main(String[] args) {
        int[] arr={10,12,22,10,8,6};
        System.out.println(leaders(arr));
    }
    public static ArrayList<Integer> leaders(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int maxRight = arr[n - 1];
        ans.add(maxRight);
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > maxRight) {
                ans.add(arr[i]);
                maxRight = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
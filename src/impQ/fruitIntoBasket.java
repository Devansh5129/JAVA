package impQ;
//brute force approach -- nested loop giving time complexity O(N^2)...
import java.util.*;
public class fruitIntoBasket {
    static void main(String[] args) {
        int [] fruits ={1,2,4,3,1,2,3,1};
        System.out.println(fruit(fruits));
        System.out.println(froot(fruits));
    }
   public static int fruit(int [] fruits){
        int n = fruits.length;
        int maxLen= 0;
        for (int i=0; i<n ;i++){
            HashSet<Integer> set = new HashSet<>();
            for (int j =i; j<n ; j++){
                set.add(fruits[j]);
                if(set.size() > 2) {
                    break;
                }
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
    //optimal approach-- giving T.C. O(N)..hashmap+sliding window
    public static int froot(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < fruits.length; right++) {
            map.put(fruits[right],
                    map.getOrDefault(fruits[right],0)+1);

            while(map.size() > 2) {

                map.put(fruits[left],
                        map.get(fruits[left])-1);
                if(map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen,
                    right-left+1);
        }
        return maxLen;
    }
}
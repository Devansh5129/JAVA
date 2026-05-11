package hash;
import java.util.*;
public class hashQue {
    // Majority Element
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {

            if (map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }
    // Union
    public static int union(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        return set.size();
    }

    // Intersection
    public static int intersection(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {

            if (set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }

        return count;
    }

    // Itinerary
    public static String getStart(HashMap<String, String> tickets) {

        HashMap<String, String> revMap = new HashMap<>();

        // destination -> source
        for (String key : tickets.keySet()) {

            revMap.put(tickets.get(key), key);
        }

        // find starting city
        for (String key : tickets.keySet()) {

            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    // Subarray Sum Equals K
    public static int subarraySum(int num[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < num.length; i++) {

            sum += num[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    // Word Pattern
    public static boolean wordPattern(String pattern, String s) {

        // convert string into words array
        String words[] = s.split(" ");

        // length mismatch
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            // CORRECTED HERE
            char ch = pattern.charAt(i);

            String word = words[i];

            // char -> word
            if (map1.containsKey(ch)) {

                if (!map1.get(ch).equals(word)) {
                    return false;
                }

            } else {
                map1.put(ch, word);
            }

            // word -> char
            if (map2.containsKey(word)) {

                if (map2.get(word) != ch) {
                    return false;
                }

            } else {
                map2.put(word, ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        int arr1[] = {1, 2, 3, 4, 6, 5};
        int arr2[] = {4, 5, 1};

        // Union
        System.out.println("Union = " + union(arr1, arr2));

        // Intersection
        System.out.println("Intersection = " + intersection(arr1, arr2));

        // Majority Element
        System.out.print("Majority Element = ");
        majorityElement(nums);

        // Itinerary
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bangalore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.print("Itinerary = ");

        while (start != null) {

            System.out.print(start);

            if (tickets.get(start) != null) {
                System.out.print(" -> ");
            }

            start = tickets.get(start);
        }

        System.out.println();

        // Subarray Sum Equals K
        int num[] = {1, 2, 3};
        int k = 3;

        System.out.println("Subarray Sum Count = " + subarraySum(num, k));

        // Word Pattern
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println("Word Pattern = " + wordPattern(pattern, s));
    }
}
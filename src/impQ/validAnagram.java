package impQ;
import java.util.*;
public class validAnagram {
    //aproach 1 - hashmaps
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            // count frequency in s
            for (char c : s.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            // count frequency in t
            for (char c : t.toCharArray()) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            return map1.equals(map2);
        }
        //approach 2
            public static boolean  isAnagram1(String s, String t) {
                if (s.length() != t.length()) return false;
                char[] sA = s.toCharArray();
                char[] tA = t.toCharArray();

                Arrays.sort(sA);
                Arrays.sort(tA);

                return Arrays.equals(sA, tA);
            }


    static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram1("anagram","nagaram"));

    }
    }


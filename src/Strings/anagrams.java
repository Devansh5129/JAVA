package Strings;
import java.util.*;



public class anagrams{
    public static void main(String[] args) {
        String s1 = "raie";
        String s2 = "care";

        // Step 1: length check
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Step 2: convert to char array
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Step 3: sort arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Step 4: compare
        if (Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

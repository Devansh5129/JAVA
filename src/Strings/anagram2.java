package Strings;
public class anagram2 {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++; //jo string ka char hoga, uski asciii value se minus karke index ki value nikaalege
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }
        for (int count : freq) {     // agar ye samjah naaye toh ak baar dono strings void rakhna ,
           if (count != 0)
               return false;
       }
           return true;
       }
        public static void main (String[] args ){
            System.out.println(isAnagram("devansh", "veansh"));
        }
    }
    // is code se pahle string me jo letters rahege wo apni apni ek value assign akr lenge
//doosri string me agar same letters huye toh minus hota jayega aur jab saara minus ho gaya toh 0-0 ho jayga sab
//and everything 0-0 means it is a anagram .

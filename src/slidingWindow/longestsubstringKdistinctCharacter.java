package slidingWindow;
//sliding window same as fruit into basket
import java.util.*;
public class longestsubstringKdistinctCharacter {
    static void main(String[] args) {
        String s ="aaabbccdddddeee";
        System.out.println(lengthOfLongestSubstringKDistinct(s,2));

    }
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left =0;
        int maxLen=0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            //jab window valid answer se bahar ja rahi toh shrink karege left increment karke
            while(map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0)
                    map.remove(leftChar);

                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
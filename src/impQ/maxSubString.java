package impQ;
//sliding wind , 2 pointer
import java.util.*;
//brute--hashset..O(N^2)
public class maxSubString {
    static void main(String[] args) {
        String s= "cadbzabcd";
        System.out.println(MaxSubString(s));
        System.out.println(lenOfMaxSubString(s));

    }
    public static int MaxSubString(String s){
        int maxLen=0;
        String sub=" ";
        int n = s.length();
        for(int i =0; i<n; i++){
            HashSet <Character> set= new HashSet<>();
            for(int j=0; j<n; j++){
                char ch = s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
    //optimal O(N) hashmap, sliding window
    public static int lenOfMaxSubString(String s){
        HashMap<Character, Integer> map= new HashMap<>();
        int left=0;
        int maxLen=0;
        for ( int right=0; right<s.length();right++){
            char ch = s.charAt(right);
            //condn for
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            map.put(ch,right);
            maxLen=Math.max(maxLen, right-left+1);

        }
        return maxLen;
    }
}

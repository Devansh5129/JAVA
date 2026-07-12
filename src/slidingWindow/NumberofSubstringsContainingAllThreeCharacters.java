package slidingWindow;
//2 pointer approach
public class NumberofSubstringsContainingAllThreeCharacters {
    static void main(String[] args) {
        String s="abcabc";
        System.out.println(numberOfSubstrings(s));
    }
    public static int numberOfSubstrings(String s){
        int[] freq = new int[3];
        int left = 0;
        int ans = 0;
        int n = s.length();
        for(int right = 0; right < n; right++) {
            freq[s.charAt(right)-'a']++;
            while(freq[0] > 0 &&
                    freq[1] > 0 &&
                    freq[2] > 0) {
                ans += n - right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return ans;
    }
}

package impQ;
//leetcode 151 reverse words in string
public class reverseWords {

        public static String reverseWord(String s) {
//split(//s+)the functn used to removed the spaces to handle the testcases
            //and reverse the array and stores in newly formed string result...
            String[] words = s.trim().split("\\s+");

            String result = "";

            for (int i = words.length - 1; i >= 0; i--) {
                result += words[i];

                if (i != 0) {
                    result += " ";
                }
            }

            return result;

        }

        public static String reverseWordsSB(String s) {
            String[]  words = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i= words.length-1; i>=0; i--){
                sb.append(words[i]);
                if(i!=0){
                    sb.append(" ");
                }

            }return sb.toString();
        }


    static void main(String[] args) {
        System.out.println(reverseWord("  the sky is blue   "));
        System.out.println(reverseWordsSB("  Devansh is name My   "));
    }
    }


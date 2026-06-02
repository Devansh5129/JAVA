package impQ;
// **LeetCode 67 (Add Binary)** uses the same idea as normal addition but with binary numbers. We start from the **rightmost digit** of both strings using two pointers and maintain a **carry** variable. At each step, we add the current digits and carry, then store the result bit using `sum % 2` and update carry using `sum / 2`. Since binary is base-2, a sum of `2` or `3` generates a carry. We continue until both strings and carry are fully processed. Because digits are added from **right to left**, the result is built in reverse order and finally reversed to get the correct binary sum. This approach works in **O(n)** time and efficiently handles different string lengths and final carry cases.

// class Solution {
//     public String addBinary(String a, String b) {
//         int m = a.length()-1;
//         int n = b.length()-1;
//         StringBuilder sb = new StringBuilder();
//          int carry =0;

//         while(m>=0 || n>=0){

//         int sum= carry+ (a.charAt(m)-'0') + (b.charAt(n)-'0');
//         m--;
//         n--;

//         if(sum%2==0){
//             sb.append("0");
//         }else{
//             sb.append("1");
//         }
//         }
//         return sb.toString() ;
//     }
//    }
class addBinary {
    static void main(String[] args) {
        System.out.println("your binary addition is : "+ addBinary1("11","10"));
    }
    public static String addBinary1(String a, String b) {
//iterating from last , adding from right to left <---
        int m = a.length() - 1;
        int n = b.length() - 1;

        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (m >= 0 || n >= 0 || carry != 0) {
//carry must be included to overall sum
            int sum = carry;

            if (m >= 0) {
                sum += a.charAt(m) - '0';
                m--;
            }

            if (n >= 0) {
                sum += b.charAt(n) - '0';
                n--;
            }
//result digit
            sb.append(sum % 2);
            carry = sum / 2;
        }
// reversing the result for reverse addition
        return sb.reverse().toString();
    }
}

package impQ;
/*
8 in binary  = 1000
7 in binary  = 0111
-------------------
n & (n - 1)  = 0000   ✔ TRUE (power of 2)
 */
// could be implemented in any no.
public class q7 {
    static void main(String[] args) {
        System.out.println(isPowerOfThree(81));

    }

    static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || (n % 3!= 0)) return false;
        return isPowerOfThree(n / 3);

    }
}


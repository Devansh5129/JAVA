package impQ;
/*
import java.util.Scanner;
public class fact {
   public static void main(String[] args) {

       System.out.println("Enter number:");

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int ans=factorial(n);
       System.out.println("factorial of number:"+ans);
    }
    static int factorial(int n){
       if(n<=1){ // in case of 0 and 1
           return 1;
       }
       return n*factorial(n-1);
    }
}
*/
public class fact {

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: The first two Fibonacci numbers are 0 and 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: Sum of the two preceding Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 20;
        System.out.println("Fibonacci series up to " + count + " terms:");


        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
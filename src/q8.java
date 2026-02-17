import java.util.Scanner;

public class q8 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println(" Enter a number : ");
    int n = sc.nextInt();
       int r;
       int temp=n;
       int sum=0;
       while(n>0){
           r =n%10;
           n = n/10;
            sum = sum + r*r*r;
       }
       if(sum==temp){

           System.out.println("it is an armstrong number");
       }
       else {
           System.out.println("not ");
       }

    }
}

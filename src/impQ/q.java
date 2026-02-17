package impQ;// if the user give number 36524 then answer must resturned as
//36524+3652+365+365+36......

import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        System.out.println("enter no.:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }

    static int sum(int n){
        if (n<=1) {
            return 0;
        }else{

            return n + sum(n / 10);
        }

}}


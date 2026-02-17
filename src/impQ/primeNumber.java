package impQ;

public class primeNumber{
   public static void main(String []args) {
       int n =109;
       for ( int i =1; i<=n; i++){
           System.out.println(i+" "+ isNumberPrime(i));
       }
    }
    static boolean isNumberPrime(int n){
       if(n<=1){
           return false;
       }
       int c=2;
       while(c*c<=n){
           if(n%c==0){
               return false;
           }
           c++;//check for 2,3,4....
       }
       return true;

    }
}

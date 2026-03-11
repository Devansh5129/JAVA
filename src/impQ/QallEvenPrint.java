package impQ;
import java.util.*;
class QallEvenPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0&& digits(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }}
    public static boolean digits(int num){
        if (num==0){
            return true; //0 is even
        }
        while(num>0){
            int digit=num%10;
            num=num/10;
            if(digit%2 !=0){return false;
            }

        } return true;
    }
}

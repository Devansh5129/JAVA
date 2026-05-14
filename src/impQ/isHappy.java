//approach 1 - flyod cycle , hare turtle
class isHappy {
    public static int sumofDigits(int n){
        int sum=0;
        while(n!=0){
            int digits = n%10;
            n=n/10;
            sum=sum+(digits*digits);
        }
        return sum;
    }
    public static boolean isHappy1(int n) {
        int fast = n ;
        int slow =n;
        while(true){
            slow=sumofDigits(slow);
            fast=sumofDigits(sumofDigits(fast));
            if(fast==1){
                return true;
            }
            if(slow==fast){
                return false;
            }

        }

    }

    static void main(String[] args) {
        System.out.println(isHappy1(19));
    }
}
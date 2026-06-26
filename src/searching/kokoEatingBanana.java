package searching;

public class kokoEatingBanana {
    static void main(String[] args) {
        int []piles={30,11,23,4,20};
        int h=5;
        System.out.println("minimum eating speed of koko would be : "+minEatingSpeed(piles,h));
    }
    //{1,2,3,(not possible) 4, onwards possible...)}
    //through bs we could reduce the search space like second half as we need minimum so getting a valid value ie,
    //less than or equal to 8 will create the possibility of search more minimum value if exists ....


    //* simple hai ki minimum pile 1 hi hoga aur maximum utna hoga jitna bada number hoga array me , tohb apan ko
    // max element nikalna rhega aur answer (1-max) me hi rahega always
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        // iterate karke max nikal lo
        for(int pile : piles){
            high = Math.max(high, pile);
        }

        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long hours = 0;
            //kitne hours lagege ye bhi nikalna pdega , toh apne ko round off value leni hai , formula ,,,,

            for(int pile : piles){
                hours += (pile + mid - 1) / mid;
            }
            if(hours <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}

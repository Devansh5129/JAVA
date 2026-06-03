class Solution {
    static void main(String[] args) {
        int [] ratings = {1,2,2};
        System.out.println(candy(ratings));
    }
    public static int candy(int[] ratings) {

        int n = ratings.length;
        int[] candies = new int[n];
        // Step 1: everyone gets 1 candy
        for(int i = 0; i < n; i++) {
            candies[i] = 1;
        }
        boolean updated = true;
        // keep checking until no update
        while(updated) {

            updated = false;

            for(int i = 0; i < n; i++) {
                // check left poora left to right traverse karke nikallena
                if(i > 0 && ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]) {

                    candies[i] = candies[i-1] + 1;
                    updated = true;
                }
                // check right same right to left ...
                if(i < n-1 && ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]) {

                    candies[i] = candies[i+1] + 1;
                    updated = true;
                }
            }
        }
        // total candies
        int total = 0;
        for(int c : candies) {
            total += c;
        }
        return total;
    }
}
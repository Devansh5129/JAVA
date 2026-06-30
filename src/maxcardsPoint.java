//sliding window
class maxcardsPoint {
    static void main(String[] args) {
        int [] cardPoints ={6,2,3,4,7,2,1,7,1}; int k =4;
        System.out.println(maxScore(cardPoints,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;

        // left se cards le lenge pahle 
        for(int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        maxsum = lsum;
        int rightIndex = n - 1;
        // Remove one from left and add one from right
        for(int i = k - 1; i >= 0; i--) {

            lsum -= cardPoints[i];
            rsum += cardPoints[rightIndex];
            // right ko badhane ke liye right -- karte jao...
            rightIndex--;
            maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;
    }
}
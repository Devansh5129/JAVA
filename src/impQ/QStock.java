package impQ;
import java.util.*;
public class QStock {
    static void main(String[] args) {
        int [] prices={7,1,5,4,3};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }
        static int maxProfit(int[] prices) {
            int buy= prices[0];
            int max =0;
            int n = prices.length;
            for ( int i =1; i< n ; i++){
                if(prices[i]<buy){
                    buy= prices[i];
                }else{
                    int profit = prices[i]-buy;
                    max= Math.max(max, profit);
                }
            }
            return max;
        }
        static int maxProfit2(int[] prices) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
    }



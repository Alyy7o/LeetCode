public class buyAndSellStock {
    public static void main(String[] args) {
        int[] stock = {7,1,5,3,6,4};
        int profit = 0;

        // Time: O(n^2)
        // for (int i=0; i<stock.length; i++) {
        //     for(int j=i+1; j<stock.length; j++){
        //         if (!(stock[i] >= stock[j])) {
        //             if (profit < (stock[j] - stock[i]) && (stock[j] - stock[i]) > 0) {
        //                 profit = stock[j] - stock[i];
        //             }
        //         }
                
        //     }

        // }

        // Check everyday as selling day and calculate profit if it gives
        // Time: O(n)
        int bestBuy = stock[0];
        for(int i=0; i<stock.length; i++){
            if(stock[i] >= bestBuy){
                profit = Math.max(profit, stock[i] - bestBuy);
            }
                bestBuy = Math.min(stock[i], bestBuy);
            
        }
        System.out.println(profit);
    }
}

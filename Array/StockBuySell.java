public class StockBuySell {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int n=prices.length;

        int maxProfit=0;
        int minday=99999;

        for(int i=0;i<n;i++) {
            if(minday>prices[i])minday=prices[i];
            else{
                maxProfit=Math.max(maxProfit, prices[i]-minday);
            }
            
        }
        System.out.println(maxProfit);
    }
}

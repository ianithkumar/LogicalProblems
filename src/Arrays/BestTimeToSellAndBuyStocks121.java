package Arrays;

public class BestTimeToSellAndBuyStocks121 {
  public static void main(String a[]) {
    int prices[] = {7, 1, 3, 5, 6, 4};
    int soFarMinimum = prices[0];
    int maxProfit=0;
    for(int i=1;i<prices.length;i++){
      if(prices[i]<soFarMinimum){
        soFarMinimum = prices[i];
      }
      else{
        int profit  = prices[i]-soFarMinimum;
        maxProfit = Math.max(maxProfit,profit);
      }
    }
    System.out.println(maxProfit);
  }
}

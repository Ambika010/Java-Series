import java.util.*;
public class Buy_and_Sell_Stocks {
    public static int buyAndSell(int prices[]){
        int buyPrice = Integer.MAX_VALUE; //cost price
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ // this is the case of profit
                int profit = prices[i] - buyPrice; // today's profit (matlab aaj jo hum sell karenge)
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of days : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the stock price for each day : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Maximum profit = "+buyAndSell(array));
    }
}

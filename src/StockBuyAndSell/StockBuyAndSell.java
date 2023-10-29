package StockBuyAndSell;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12}; int n=5;
        int maxProfit=maxProfit(arr,n);
        System.out.println("Max Profit is : "+maxProfit);

    }
    public static int maxProfit(int arr[], int n){
        int minSoFar=arr[0];
        int maxProfit=0;
        for (int i=1; i<n; i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            int profit = arr[i]-minSoFar;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}

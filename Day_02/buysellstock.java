public class buysellstock {
    public static void main(String[] args) {
        int arr[] = {7,5,4,9,2};
        int min_price = arr[0];
        int profit = 0;
        int n = arr.length;
        
        for(int i = 0 ; i < n ; i++){
            min_price = Math.min(min_price,arr[i]);
            profit = Math.max(profit,arr[i] - min_price);
        }   
          System.out.println("Maximum Profit: " + profit);
    }
}

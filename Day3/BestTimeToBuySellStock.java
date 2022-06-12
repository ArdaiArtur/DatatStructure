package Day3;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        
    }
    public int maxProfit(int[] prices) {
        int max=0;
        int s=0;
        int i=0;
        int j=1;
        int l=prices.length;
        while(i<l && j<l)
        {   
        if(prices[i]>prices[j])
        {
            i=j;
            j=i+1;
        }
        else
        {
            s=prices[j]-prices[i];
            max=Math.max(max, s);
            j++;
        }
        }
        return max;
    }
}

public class CurrencyConversion {
    public static void main(String args[]) {

      double amountInUSD = 100.0; 

double exchangeRateUSDToEUR = 0.85;
System.out.println("the initial amount in USD"+amountInUSD);
amountInUSD *= exchangeRateUSDToEUR  ;
System.out.println("the  amount in USD"+amountInUSD);
amountInUSD -= 55;
System.out.println("the  amount in USD"+amountInUSD);
amountInUSD /= exchangeRateUSDToEUR  ;
System.out.printf("Amount in USD after converting back: %.2f", amountInUSD);




    }
}

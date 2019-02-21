import java.util.Arrays;

public class CurrencyApplication {
    private static final String USD = "USD";
    private static final String PLN = "PLN";

    public static void main(String[] args) {

        String usd = "american dollar";

        Currency usdCurrency = Currency.USD;
        System.out.println(usdCurrency.getExchangeRate());

        Currency[] values = Currency.values();
        System.out.println(Arrays.toString(values));

        Currency pln = Currency.valueOf("PLN");
        System.out.println(pln.getExchangeRate());


    }
}

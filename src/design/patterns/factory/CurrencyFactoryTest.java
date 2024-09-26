package design.patterns.factory;

public class CurrencyFactoryTest {

    public static void main(String... args) {
        Currency currency = CurrencyFactory.newCurrency(Country.PORTUGAL);
        System.out.println(currency.getSymbol());
    }
}

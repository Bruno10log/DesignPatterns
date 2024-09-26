package design.patterns.factory;

public class CurrencyFactory {

    public static Currency newCurrency (Country country) {
        switch(country) {
            case Country.PORTUGAL :
                return new Euro();
            case Country.BRAZIL:
                return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}

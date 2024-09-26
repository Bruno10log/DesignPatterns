package design.patterns.strategy;

import java.math.BigDecimal;

public class Dhl implements ICourier {

    @Override
    public BigDecimal shippingPriceCalculator(float weight) {
        return BigDecimal.valueOf(2.0);
    }

}

package design.patterns.strategy;

import java.math.BigDecimal;

public class Ctt implements ICourier {

    @Override
    public BigDecimal shippingPriceCalculator(float weight) {
        return BigDecimal.valueOf(1.0);
    }

}

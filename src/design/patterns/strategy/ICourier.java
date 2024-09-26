package design.patterns.strategy;

import java.math.BigDecimal;

public interface ICourier {

    BigDecimal shippingPriceCalculator(float weight);

}

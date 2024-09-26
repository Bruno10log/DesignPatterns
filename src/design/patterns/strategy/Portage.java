package design.patterns.strategy;

import java.math.BigDecimal;

public class Portage {

    private ICourier courier;

    public Portage(ICourier courier) {
        this.courier = courier;
    }

    public void setCourier(ICourier courier) {
        this.courier = courier;
    }

    public BigDecimal calc(float weight) {
        return courier.shippingPriceCalculator(weight);
    }
}
